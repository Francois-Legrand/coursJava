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

## Notion d'encapsulation avec la création de getters et de setters
La signification de l'encapsulation est de s'assurer que les données sensibles sont cachées aux utilisateurs. Pour y parvenir, vous devez:

- déclarer les variables / attributs de classe comme private
- fournir des méthodes publiques get et set pour accéder et mettre à jour la valeur d'une private variable

Les getters et les setters servent aux utilisateurs d'interface de programmation afin qu'il puisse profiter des fonctionnalités lié à l'application sans mettre en danger l'intégrité des données et/ou un eventuel processus de fonctionnalités (calcul,algoritmie).

		public String getName() {
				
				return name;
			}
		
			public void setName(String name) {
				
				this.name = name;
			}
		
			public int getYear() {
				
				return dateCourte - year;
			}
		
			public void setYear(int year) {
				
				if (year < 1) {
					
					this.year = year;
					
					System.out.println("Vous ne pouvez pas faire cela");
					
					
				}else if (year >= 1 && year < 18) {
					
					System.out.println("Vous avez "+year+" ans, l'accès est donc interdit");
					
				}else {
					
					System.out.println("Vous avez "+year+" ans, vous avez accès au site");
					
					this.year = year;
				}
				
			}
## Notion des modificateurs d'accès (friendly, public, protected, pivate) 

Quand vous définissez des membres dans une classe, vous avez le choix parmi quatre niveaux de visibilité. Trois de ces niveaux (public, protected et private) sont associés à des mots clés. Le quatrième niveau s'obtient en ne spécifiant aucune mot clé relatif à la visibilité. Et oui, contrairement, à ce que beaucoup de monde pense, ne rien préciser ne veut pas dire qu'on a un accès public.

### La visibilité public
	
	- Si vous définissez un membre (attribut, méthode...) public il sera alors accessible de n'importe ou dans le programme, dans n'importe quelle classe et dans n'importe quel dossier d'une classe.
	
### La visibilité protected
	- Un membre marqué dans une classe comme étant protégé (mot clé protected) peut être manipulé : Dans la classe qui définit ce membre,
Dans les classes qui dérivent de la classe considérée,
Et dans toutes les classes (et les types) définies dans le même package que celle qui définit le membre protégé.
