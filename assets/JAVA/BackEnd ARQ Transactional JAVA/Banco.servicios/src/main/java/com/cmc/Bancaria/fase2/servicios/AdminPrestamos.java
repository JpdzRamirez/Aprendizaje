package com.cmc.evaluacion.fase2.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cmc.commons.util.DateUtil;
import com.cmc.evaluacion.fase2.commons.UncheckedException;
import com.cmc.evaluacion.fase2.entidades.Cartera;
import com.cmc.evaluacion.fase2.entidades.Cliente;
import com.cmc.evaluacion.fase2.entidades.Prestamo;

public class AdminPrestamos {

	private  Logger logger = LogManager.getLogger(AdminPrestamos.class);
	
	public static void armarPrestamo(String[] _partes,Cliente _cliente){
		Prestamo tempPrestamo;
		String tipoPrestamo=null;
		char tempChar;
		String fecha=null;
		Date dateTemp=null;
		
		tempChar=_partes[1].charAt(0); //Instanciamos una variable con la primera letra del tipo de prestamo
		tipoPrestamo=Character.toString(tempChar);// Cast to string
		
			tempPrestamo=new Prestamo(_partes[1],_partes[0]);
			fecha=_partes[2];
			try {
				dateTemp=DateUtil.convertir(fecha);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tempPrestamo.setFecha(dateTemp);
			tempPrestamo.setMonto(Double.parseDouble(_partes[3]));
			if(tipoPrestamo.equals("H")){
				
			}else if(tipoPrestamo.equals("Q")){
				tempPrestamo.setTipo("Q");
			}else if(tipoPrestamo.equals("H")){
				tempPrestamo.setTipo("H");
			}else if(tipoPrestamo.equals("O")){
				tempPrestamo.setTipo("O");
			}
			
			_cliente.agregarPrestamo(tempPrestamo);;
		
		
	}	
	
	public void colocarPrestamos(String _rutaArchivo, Cartera _cartera){
		 
		File file = new File(_rutaArchivo);
		String tempLinea;
		BufferedReader buffer = null;
		FileReader fileReader = null;
		String[] partes;
		Cliente clienteTemp=null;
		int contadorLineas=0;
		try {
			fileReader = new FileReader(file);
			buffer = new BufferedReader(fileReader);
			tempLinea = "";
			while ((tempLinea = buffer.readLine()) != null) {
				partes=tempLinea.split("-");
				try{
					if(partes.length<4){
						logger.error("error al armar prestamo del cliente en la linea");
						throw new UncheckedException("Error al armar cliente en la linea"+contadorLineas);
					}else{
						clienteTemp=_cartera.buscarCliente(partes[0]);
						if(clienteTemp!=null){ //BUSCAMOS AL CLIENTE Y SE EJECUTA SOLO SI EXISTE EN LA CARTERA
							armarPrestamo(partes,clienteTemp);
						}
					}
					
				}
				catch(UncheckedException e){
					logger.error("error al armar cliente en la linea",e);
				}
				contadorLineas++;
			}
		} catch (FileNotFoundException e) {
			logger.error("Error al leer el archivo, archovo no encontrado", e);
			throw new UncheckedException("Nose pudo leer el archivo" + _rutaArchivo);
		} catch (IOException i) {
			logger.error("Error al leer el archivo, archovo no encontrado", i);
			throw new UncheckedException("Nose pudo leer el archivo" + _rutaArchivo);
		} finally {
			try {
				if (buffer != null) {
					buffer.close();
					logger.info("El buffer ha sido cerrado");
				}

			} catch (IOException e) {
				logger.error("Error al cerrar el archivo", e);
			}
			try {
				if (fileReader != null) {
					fileReader.close();
					logger.info("El buffer ha sido cerrado");
				}

			} catch (IOException e) {
				logger.error("Error al cerrar el archivo", e);
			}

		}
	}
	}

