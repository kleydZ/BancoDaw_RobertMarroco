# BancoDAW

Proyecto de recuperacion del modulo Entornos de Desarrollo · 1 DAW
Curso 2025/2026 · IES La Mar (Xabia)

Alumno: Robert Marroco Checkley
Profesora: Anabel Devesa Soler

## Descripcion

Aplicacion Java que gestiona clientes, cuentas bancarias y operaciones
para una pequeña entidad bancaria. Las cuentas pueden ser corrientes
o de ahorro, y sobre cada una se pueden realizar ingresos y retiradas
con validacion de errores.

## Estructura de clases

- Cliente
- CuentaBancaria (abstracta)
- CuentaCorriente
- CuentaAhorro
- Operacion
- Main

## Pruebas unitarias

- CuentaBancariaTest (11 tests JUnit 5)

## Codigos de resultado de ingresar y retirar

| Codigo | Significado              |
|--------|--------------------------|
| 0      | Operacion correcta       |
| 1      | Cantidad negativa        |
| 2      | Cantidad igual a cero    |
| 3      | Saldo insuficiente       |

## Como ejecutar

Abrir el proyecto en IntelliJ IDEA y ejecutar la clase Main.
Para las pruebas, hacer clic derecho sobre CuentaBancariaTest y Run.

Desde terminal:

    javac -d out src/*.java
    java -cp out Main

## Estado del proyecto

- Entrega 1: analisis y diagrama UML
- Entrega 2: estructura de clases y Git inicial
- Entrega 3: metodos ingresar y retirar, JUnit, depuracion y Javadoc
- Entrega 4: Git avanzado, fork, pull request y reflexion final
