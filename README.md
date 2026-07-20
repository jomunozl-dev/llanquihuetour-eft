![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Final Transversal – Desarrollo Orientado a Objetos I     📲 [LLanquihueTourAPP]

## 👤 Autor del proyecto
- **Nombre completo:** [Jorge Munoz Leon]
- **Sección:** [2026_202_OL_PRY2202_24613390_PCT]
- **Carrera:** [Analista Programador Computacional]
- **Sede:** [ONLINE]

---

## 📘 Descripción general del sistema
LlanquihueTourApp es una aplicación desarrollada en Java que simula un sistema de gestión para la agencia turística Llanquihue Tour. El sistema permite administrar clientes, guías turísticos, proveedores, tours y reservas mediante una estructura organizada y orientada a objetos.

La aplicación incorpora principios fundamentales de la Programación Orientada a Objetos, como encapsulamiento, herencia, polimorfismo, composición e interfaces, además de utilizar colecciones (ArrayList, HashMap y List) para la gestión de datos, lectura de información desde archivos de texto y validación de datos mediante excepciones personalizadas.

Su objetivo es ofrecer una solución modular y reutilizable que facilite la organización de la información y demuestre la aplicación práctica de los conceptos estudiados en la asignatura de Fundamentos de Programación Orientada a Objetos.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 resources/    #Contiene los archivos de texto (.txt) utilizados como datos de prueba del sistema, desde los cuales se carga la información de clientes, guías turísticos, proveedores y tours.
├── clientes.txt
├── guias.txt
├── proveedores.txt
└── tours.txt 
📁 src/
├── app/         # Contiene la clase principal (Main), responsable de iniciar la ejecución del sistema y coordinar la carga inicial de los datos.
├── data/        # Contiene las clases encargadas de leer los archivos de texto (.txt) y convertir la información en objetos del sistema.
├── exceptions/  # Contiene las excepciones personalizadas utilizadas para controlar errores y validar la información ingresada por el usuario.
├── interfaces/  # Define las interfaces utilizadas por las clases del sistema para establecer comportamientos comunes y favorecer el polimorfismo.
├── model/       # Incluye las clases que representan las entidades del sistema, como clientes, guías turísticos, proveedores, tours, reservas, direcciones y RUT.
├── service/     # Implementa la lógica de negocio del sistema, administrando las colecciones de objetos, operaciones de registro, búsqueda y visualización de datos.
└── utils/       # Incluye clases utilitarias de apoyo, como la validación del RUT y otras funciones reutilizables.
````

---



## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/usuario/repositorio-evaluacion-final.git
```

2. Abre el proyecto en Netbeans\IntelliJ IDEA.

3. Verifica que los archivos `.txt` estén correctamente ubicados.

4. Ejecuta el archivo `Main.java` desde el paquete `app`.

5. Sigue las instrucciones en consola o en la interfaz gráfica (si corresponde).


---

**Repositorio GitHub:** \[https://github.com/jomunozl-dev/llanquihuetour-eft]
**Fecha de entrega:** \[19/07/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Final Transversal EFT



