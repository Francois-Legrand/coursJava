# Un Cours de java
## Création d'un package

Un package est un dossier dans lequel des classes et du code ci trouvera.

## Création d'une classe
- Une classe represente un ensemble d’objets ayant la même représentation mémoire (structure) et les mêmes comportements,
- définissant cette structure
- définissant et détenant ces comportements
- capable de générer des instances.

## Création de la méthode main

Une méthode est une fonction ou procédure nommée, la méthode main se lance en premier. Une méthode est définie au sein d’une classe et définissant une propriété fonctionnelle
des instances de la classe. Elle d'écrit comment une instance de cette classe va réagir à la réception du message
correspondant à son nom.

## Types de variables
![image contenant plusieurs types de variable java](http://www.write-technical.com/126581/session2/index.6.gif)

## Création de variables

Une variable est une boite dans laquelle une/des information(s) vont ci trouver.
Pour déclarer une variable : 

		public static void main(String[] args) {
			
			String name = "myName";
			byte byte = 127;
			short short = 32767;
			int int = 2147483647;
			double = 1.2;
			
			//ect
		
		
		}

## Création d'un constructeur

Pour instancier une classe, c'est-à-dire créer un objet à partir d'une classe, il s'agit d'utiliser l'opérateur new.
En réalité l'opérateur new, lorsqu'il est utilisé, fait appel à une méthode spéciale de la classe: le constructeur.

Le rôle du constructeur est de déclarer et de permettre d'initialiser les données membres de la classe, ainsi que de permettre différentes actions (définies par le concepteur de la classe) lors de l'instanciation.

Un constructeur se définit comme une méthode standard, mais ne renvoie aucune valeur.
Ainsi, le constructeur d'un objet porte le même nom que la classe et ne possède aucune valeur de retour (même pas void).

	
- un constructeur porte le même nom que la classe dans laquelle il est défini
- un constructeur n'a pas de type de retour (même pas void)
- un constructeur peut avoir des arguments
- la définition d'un constructeur n'est pas obligatoire lorsqu'il n'est pas nécessaire


