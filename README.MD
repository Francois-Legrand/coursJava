# Un Cours de java
## CrÃ©ation d'un package

Un package est un dossier dans lequel des classes et du code ci trouveront.
Les préconisations de nommage minimum sont:
- La premier partie commence par la langue de l'entreprise qui développe l'application suivi du point.
- La deuxième partie sera le nom de l'entreprise suivi d'un point.
- La troisième partie sera le nom du projet.
## CrÃ©ation d'une classe
- Une classe represente un ensemble dâ€™objets ayant la mÃªme reprÃ©sentation mÃ©moire (structure) et les mÃªmes comportements,
- dÃ©finissant cette structure
- dÃ©finissant et dÃ©tenant ces comportements
- capable de gÃ©nÃ©rer des instances.

## CrÃ©ation de la mÃ©thode main

Une mÃ©thode est une fonction ou procÃ©dure nommÃ©e, la mÃ©thode main se lance en premier. Une mÃ©thode est dÃ©finie au sein dâ€™une classe et dÃ©finissant une propriÃ©tÃ© fonctionnelle
des instances de la classe. Elle d'Ã©crit comment une instance de cette classe va rÃ©agir Ã  la rÃ©ception du message
correspondant Ã  son nom.

## Types de variables
![image contenant plusieurs types de variable java](http://www.write-technical.com/126581/session2/index.6.gif)

## CrÃ©ation de variables

Une variable est une boite dans laquelle une/des information(s) vont ci trouver.
Pour dÃ©clarer une variable : 

		public static void main(String[] args) {
			
			String name = "myName";
			byte byte = 127;
			short short = 32767;
			int int = 2147483647;
			double = 1.2;
			
			//ect
		
		
		}

## CrÃ©ation d'un constructeur

Pour instancier une classe, c'est-Ã -dire crÃ©er un objet Ã  partir d'une classe, il s'agit d'utiliser l'opÃ©rateur new.
En rÃ©alitÃ© l'opÃ©rateur new, lorsqu'il est utilisÃ©, fait appel Ã  une mÃ©thode spÃ©ciale de la classe: le constructeur.

Le rÃ´le du constructeur est de dÃ©clarer et de permettre d'initialiser les donnÃ©es membres de la classe, ainsi que de permettre diffÃ©rentes actions (dÃ©finies par le concepteur de la classe) lors de l'instanciation.

Un constructeur se dÃ©finit comme une mÃ©thode standard, mais ne renvoie aucune valeur.
Ainsi, le constructeur d'un objet porte le mÃªme nom que la classe et ne possÃ¨de aucune valeur de retour (mÃªme pas void).

	
- un constructeur porte le mÃªme nom que la classe dans laquelle il est dÃ©fini
- un constructeur n'a pas de type de retour (mÃªme pas void)
- un constructeur peut avoir des arguments
- la dÃ©finition d'un constructeur n'est pas obligatoire lorsqu'il n'est pas nÃ©cessaire

## Notion d'encapsulation avec la crÃ©ation de getters et de setters
La signification de l'encapsulation est de s'assurer que les donnÃ©es sensibles sont cachÃ©es aux utilisateurs. Pour y parvenir, vous devez:

- dÃ©clarer les variables / attributs de classe comme private
- fournir des mÃ©thodes publiques get et set pour accÃ©der et mettre Ã  jour la valeur d'une private variable

Les getters et les setters servent aux utilisateurs d'interface de programmation afin qu'il puisse profiter des fonctionnalitÃ©s liÃ© Ã  l'application sans mettre en danger l'intÃ©gritÃ© des donnÃ©es et/ou un eventuel processus de fonctionnalitÃ©s (calcul,algoritmie).

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
## Notion des modificateurs d'accÃ¨s (friendly, public, protected, private) 

Quand vous dÃ©finissez des membres dans une classe, vous avez le choix parmi quatre niveaux de visibilitÃ©. Trois de ces niveaux (public, protected et private) sont associÃ©s Ã  des mots clÃ©s. Le quatriÃ¨me niveau s'obtient en ne spÃ©cifiant aucune mot clÃ© relatif Ã  la visibilitÃ©. Et oui, contrairement, Ã  ce que beaucoup de monde pense, ne rien prÃ©ciser ne veut pas dire qu'on a un accÃ¨s public.

### La visibilitÃ© public
	
- Si vous dÃ©finissez un membre (attribut, mÃ©thode...) public il sera alors accessible de n'importe ou dans le programme, dans n'importe quelle classe et dans n'importe quel dossier d'une classe.
	
### La visibilitÃ© protected

- Un membre marquÃ© dans une classe comme Ã©tant protÃ©gÃ© (mot clÃ© protected) peut Ãªtre manipulÃ© : Dans la classe qui dÃ©finit ce membre,
Dans les classes qui dÃ©rivent de la classe considÃ©rÃ©e,
Et dans toutes les classes (et les types) dÃ©finies dans le mÃªme package que celle qui dÃ©finit le membre protÃ©gÃ©.

### La visibilitÃ© friendly ou package private

- En l'absence de mot clÃ© pour spÃ©cifier la visibilitÃ©, un membre sera considÃ©rÃ© comme Ã©tant package private (on peut simplifier en parlant de visibilitÃ© package). C'est donc le mode de visibilitÃ© par dÃ©faut (absence de mot clÃ©). Cela veut dire que le membre sera accessible par tout code Java localisÃ© dans le mÃªme package.

### La visibilitÃ© private
- Dans ce dernier cas, seule la classe ayant dÃ©finit le membre pourra y accÃ©der.
