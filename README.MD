# Un Cours de java
## Création d'un package

Un package est un dossier dans lequel des classes et du code ci trouveront.
Les préconisations de nommage minimum sont:
- La premier partie commence par la langue de l'entreprise qui développe l'application suivi du point.
- La deuxième partie sera le nom de l'entreprise suivi d'un point.
- La troisième partie sera le nom du projet.

## Création d'une classe
- Une classe represente un ensemble d'objets ayant la même représentation mémoire (structure) et les mêmes comportements,
- définissant cette structure
- définissant et détenant ces comportements
- capable de génerer des instances.

## Notion d'héritage
L'héritage permet de créer des classes filles qui reprendront les mêmes attributs et méthodes que cette classe mère. il estpossible de spécialiser ces classes filles en y ajoutant des attributs et/ou méthodes supplémentaires.

## Surcharge de méthode
Lorsqu'on définit une classe, on peut y définir plusieurs méthodes qui portent le même nom. La seule contrainte est que la liste des types des paramètres formels doit être différente. Ce mécanisme est appelé surcharge de méthode. Il n'y a aucune contrainte sur les différents modificateurs ou sur la valeur de retour et on peut également appliquer la surcharge aux constructeurs.

## Redefinition de méthode
La redéfinition sont des méthodes de sous classe qui ont les mêmes noms que les méthodes déclarées dans une classe mère. L'appel de super() dans une méthode fait réference à une méthode de la classe mère est peut être redéfini comme dans l'exemple du contructeur.

## Création de la méthode main

Une méthode est une fonction ou procédure nommée, la méthode Main se lance en premier. Une méthode est définie au sein d'une classe et définissant une propriété fonctionnelle
des instances de la classe. Elle d'écrit comment une instance de cette classe va réagir à la réception du message
correspondant à son nom.

## Types de variables
![image contenant plusieurs types de variable java](http://www.write-technical.com/126581/session2/index.6.gif)

## Création de variables primitives et de réference

Une variable est une boite dans laquelle une/des information(s) vont ci trouver (définition simpliste [méthode Feynman]).
Les déclarations primitives de variables ne commencent pas par une majuscule et ne font pas réference à une classe tandis que les variables de réference commencent toutes par une majuscules faisant donc réference à une classe.

- Une variable primitive contient des bits qui représentent sa valeur.  Exemple : int, foat , boolean.
- Une variable référence contient des bits qui indiquent comment  accéder à l'objet. Exemple : String, Chien, Joueur,...

			String name = "Je fais réference à une classe";
			byte byte = 127;
			short short = 32767;
			int nombre = 2147483647;
			double = 1.2;
			
## Création d'un constructeur

Pour instancier une classe, c'est-à-dire créer un objet à partir d'une classe, il s'agit d'utiliser l'opérateur new.
En réalité l'opérateur new, lorsqu'il est utilisé, fait appel à une méthode spéciale de la classe: le constructeur.

Le rôle du constructeur est de déclarer et de permettre d'initialiser les données membres de la classe, ainsi que de permettre différentes actions (définies par le concepteur de la classe) lors de l'instanciation.

Un constructeur se définit comme une méthode standard, mais ne renvoie aucune valeur.
Ainsi, le constructeur d'un objet porte le mÃªme nom que la classe et ne posséde aucune valeur de retour (même pas void).

	
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
					
					System.out.println("Vous avez "+year+" ans, l'accÃ¨s est donc interdit");
					
				}else {
					
					System.out.println("Vous avez "+year+" ans, vous avez accÃ¨s au site");
					
					this.year = year;
				}
				
			}
## Notion des modificateurs d'accés (friendly, public, protected, private) 

Quand vous définissez des membres dans une classe, vous avez le choix parmi quatre niveaux de visibilité. Trois de ces niveaux (public, protected et private) sont associés à des mots clés. Le quatrième niveau s'obtient en ne spécifiant aucune mot clé relatif à la visibilité. Et oui, contrairement, à ce que beaucoup de monde pense, ne rien préciser ne veut pas dire qu'on a un accès public.

### La visibilité public
	
- Si vous définissez un membre (attribut, méthode...) public il sera alors accessible de n'importe ou dans le programme, dans n'importe quelle classe et dans n'importe quel dossier d'une classe.
	
### La visibilité protected

- Un membre marqué dans une classe comme étant protégé (mot clÃ© protected) peut être manipulé : Dans la classe qui définit ce membre,
Dans les classes qui dérivent de la classe considérée,
Et dans toutes les classes (et les types) définies dans le même package que celle qui définit le membre protégé.

### La visibilité friendly ou package private

- En l'absence de mot clé pour spécifier la visibilité, un membre sera considéré comme étant package private (on peut simplifier en parlant de visibilité package). C'est donc le mode de visibilité par défaut (absence de mot clé). Cela veut dire que le membre sera accessible par tout code Java localisé dans le même package.

### La visibilité private
- Dans ce dernier cas, seule la classe ayant définit le membre pourra y accéder.

## Le mot clé static
Pour une variable ou une méthode le mot clé static représente une invoquation sans devoir instancier une classe et est donc partagé par tous les objets instancier de la classe. Une méthode dite static ne dépend pas des valeurs de variables d'une instance.
Exemple:

		public class People {
			private String nom;
			private int age;
			protected static int nombreDePersonne;
	
			public People(String nom, int age) {
				this.nom = nom;
				this.age = age;
				nombreDePersonne++;
			}
	
		}
		public static void main(String[] args) {
		
			People franck = new People("Franck", 40);
			People tony = new People("Tony", 46);
			
			System.out.println(People.nombreDePersonne);
		

		}
## Notion de polymorphisme
Le mot polymorphisme exprime litteralement "plusieurs" "formes" car en effet la notion de polymorphisme en Java est la capacité d'un objet à prendre plusieurs formes.
Une autre définition conciste à dire le polymorphisme c'est le fait de referencer une classe fille avec toutes les réference d'une classe mère. Exemple:





