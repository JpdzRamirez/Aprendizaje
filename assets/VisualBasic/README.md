
# Conocimientos en Visual Basic y aplicaciones 

- Fundamentos aplicados en Microsoft Excel Avanzado <br>
  - 🧮Funciones matematicas para datos numericos : (Máximo, Mínimo, Promedio, Contar, Sumar)
  - ✅Funciones de busqueda y tratamiento datos de datos TXT : (BuscarV, BuscarH, Coincodemcias, Concatenar, Lenght, Extraer y encontrar)
  - ⚖Funciones Condicionales y operadores logicos (IF, ELSE, &&, || OR, etc.)
  - 🔐Proteccion de celdas y libros (seguridad y control de datos)
  - 🔍Auditoría e inpección de Formulas y libros de excel (Precedentes y Dependientes)
  - 📊Tabulación de datos y Graficos (Tablas dinamicas, Filtros Avanzados, Graficos Dinamicos)
  - 📑Comportamientos de Listas de Excel (Organización de Datos, Busqueda de duplicados, BDSUMA, Validacion, Subtotales)
  - 🚨PowerPivot e Indicadores KPI 
  - 📲Listas desplegables (Directo e Inderecto)
- ### Desarrollo de algoritmos especializados en gestionar bases de Datos 📚🔍
  - <details>
        <summary>Algoritmo Calculo entre fechas</summary>
        <p align="center" id="alg_1">
        
          ´´´
         ## Diseño de Funcion Calculo Edad
                  Function CalculoEdad(FI As Date, FF As Date, Value As String) As String

                  Dim A, Mes, S, Dia As Double
                  Dim Llave As String

                  S = DateDiff("m", FI, FF) 'Devuelve
                              If S >= 12 Then
                                Llave = "A"
                                ElseIf S < 12 & S > 0 Then
                                Llave = "M"
                                Else
                                S = 0
                                Llave = "D"
                                End If

                      If Value = Llave Then

                                  If Llave = "A" Then
                                          A = DateDiff("yyyy", FI, FF)
                                          CalculoEdad = A & " Año(s) "
                                  ElseIf Llave = "M" Then
                                      Mes = DateDiff("m", FI, FF)
                                     CalculoEdad = Mes & " Mes(es) "
                                  ElseIf Llave = "D" Then
                                     Dia = DateDiff("d", FI, FF)
                                     CalculoEdad = Dia & " Dia(s) "
                                  End If



                      Else

                      CalculoEdad = "-"

                      End If

                  End Function
         ´´´
      </p>
      </details></td>
      
   -  <details>
          <summary>Automatizador en calculos (Function)</summary>
          <p align="center" id="gif_2">
          <img align="center" src="https://user-images.githubusercontent.com/66846214/125505806-60d113b8-699d-4741-99b8-ce8ec61635d1.gif" "> <br>
          </p>
        </details></td> 
   - <details>
        <summary><a href="https://github.com/JpdzRamirez/VCProject/tree/main/assets/VisualBasic/Bases%20de%20Datos/Libros%20Excel/EPS">Tansposicion de Datos</a></summary>
        <p align="center" id="gif_1">
        <img align="center" src="https://media.giphy.com/media/Sb9KqeeymLlESGWZyE/giphy.gif" width="300px"> <br>
      </p>
      </details></td>



- Conocimientos En desarrollo de applicaciones e interfaces graficas para Microsoft Excel 📈 
  -  <details>
        <summary>Autogestor</summary>
        <p align="center" id="gif_1">
        <img align="center" src="https://media.giphy.com/media/Sb9KqeeymLlESGWZyE/giphy.gif" width="300px"> <br>
      </p>
      </details></td>
  -   <details>
        <summary>Interfaz grafica</summary>
        <p align="center" id="gif_2">
        <img align="center" src="https://media.giphy.com/media/ibpZRllW17kyJTlCMA/giphy.gif" width="300px"> <br>
      </p>
      </details></td>
     -  <details>
          <summary>Diseño de aplicaciones interactivas</summary>
          <p align="center" id="gif_2">
          <img align="center" src="https://user-images.githubusercontent.com/66846214/125505239-205c3f5d-f197-4708-adfd-4faa85c7367c.gif" > <br>
          </p>
        </details></td>
     
     

