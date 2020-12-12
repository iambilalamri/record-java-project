## Definition of Big O notation
1. A mathematical notation that describes the limiting behavior of a function when the argument tends towards a particular value or infinity <br/>
2. We use Big O to describe the performance of an algorithm <br/>

[Time complexity](https://adrianmejia.com/most-popular-algorithms-time-complexity-every-programmer-should-know-free-online-tutorial-course/)

## Linked List

LinkedList sont des structures de données linéaires où les éléments ne sont pas stockés dans des emplacements contigus et chaque élément est un objet séparé avec une partie de données et une partie d'adresse. Les éléments sont liés à l'aide de pointeurs et d'adresses. Chaque élément est appelé un nœud.<br/>
En termes simples, une liste chaînée se compose de nœuds où chaque nœud contient un champ de données et une référence (lien) vers le nœud suivant dans la liste<br/><br/>
Images de la site de GeeksforGeeks: [Linked List](https://www.geeksforgeeks.org/data-structures/linked-list/)
<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/Linkedlist.png" />
## Vocabilary
1. Post-Increment : Value is first used for computing the result and then incremented: index++
2. Pre-Increment : Value is incremented first and then result is computed: ++index

`count--;`<br/>
`return items[count];`<br/>

`return items[--count];`

## Stack (LIFO)
La classe Stack  modélise et implémente une structure de données Stack . La classe est basée sur le principe de base du dernier entré, premier sorti. En plus des opérations push et pop de base, la classe fournit trois autres fonctions: vide, recherche et aperçu. On peut également dire que la classe étend Vector et traite la classe comme une pile avec les cinq fonctions mentionnées. La classe peut également être appelée la sous-classe de Vector

## Queue (FIFO)
Queue en Java est une structure de données ordonnée linéaire qui suit l'ordre FIFO (premier entré, premier sorti) des éléments. Cela signifie que l'élément inséré en premier dans la file d'attente sera le premier élément à être supprimé. En Java, la file d'attente est implémentée comme une interface qui hérite de l'interface Collection.<br/>

Type de Queue: Priority Queue


## Hash Table
Une table de hachage est, en informatique, une structure de données qui permet une association clé–valeur, c'est-à-dire une implémentation du type abstrait tableau associatif. Son but principal est de permettre de retrouver une clé donnée très rapidement, en la cherchant à un emplacement de la table correspondant au résultat d'une fonction de hachage calculée en O(1). Cela constitue un gain de temps très important pour les grosses tables, lors d'une recherche ou d'un besoin d'accès aux données en utilisant la clé définie.

1. javascript: Object
2. Java: HashMap
3. Python: Dictionnary

## Circular Arrays
Un tableau est appelé circulaire (Circular array) si nous considérons le premier élément comme le suivant du dernier élément. Les tableaux circulaires sont utilisés pour implémenter la file d'attente.

## Functional Programming
Le principe général de la programmation fonctionnelle est
de concevoir des programmes comme des fonctions
mathématiques que l'on compose entre elles. A la différence
des programmes impératifs organisés en instructions
produisent des effets de bords, les programmes fonctionnels
sont bâtis sur des expressions dont la valeur est le résultat du
programme. En particulier dans un langage fonctionnel, il
n'existe pas d'effet de bord.<br/>
Un programme fonctionnel consiste en une expression E
(représentant l'algorithme et les entrées). Cette expression E
est sujette à des règles de réécriture : la réduction consiste
en un remplacement d'une partie de programme fonctionnel
par une autre partie de programme selon une règle de
réécriture bien définie. Ce processus de réduction sera répété
jusqu'a l'obtention d'une expression irréductible (aucune
partie ne peut être réécrite). L'expression E* ainsi obtenue
est appelée forme normale (fn) de E et constitue la sortie du
programme.<br/>
Exemple : SQR 3+2

## Procedural Programming
Une procédure, aussi appelée routine, sous-routine ou fonction (à ne pas confondre avec les fonctions de la programmation fonctionnelle reposant sur des fonctions mathématiques), contient simplement une série d'étapes à réaliser. N'importe quelle procédure peut être appelée à n'importe quelle étape de l'exécution du programme, y compris à l'intérieur d'autres procédures, voire dans la procédure elle-même (récursivité).<br/><br/>

La programmation procédurale est un meilleur choix qu'une simple programmation séquentielle. Les avantages sont en effet les suivants 

1. La possibilité de réutiliser le même code à différents emplacements dans le programme sans avoir à le retaper (factorisation), ce qui a pour effet la réduction de la taille du code source et un gain en localité des modifications, donc une amélioration de la maintenabilité (compréhension plus rapide, réduction du risque de régression);
2. Une façon plus simple de suivre l'exécution du programme : la programmation procédurale permet de se passer d'instructions telles que goto, évitant ainsi bien souvent de se retrouver avec un programme compliqué qui part dans toutes les directions (appelé souvent « programmation spaghetti») ; cependant, la programmation procédurale permet les « effets de bord », c'est-à-dire la possibilité pour une procédure qui prend des arguments de modifier des variables extérieures à la procédure auxquelles elle a accès (variables de contexte plus global que la procédure).

## Diff PP 
un langage fonctionnel (idéalement) vous permet d'écrire une fonction mathématique, c.-à-d. une fonction qui prend n arguments et renvoie une valeur. Si le programme est exécuté, cette fonction est logiquement évaluée comme nécessaire. 1

un langage procédural, d'autre part, exécute une série de séquentielle pas. (Il y a une façon de transformer la logique séquentielle en logique fonctionnelle appelée continuation passing style .)

par conséquent, un programme purement fonctionnel donne toujours la même valeur pour une entrée, et l'ordre d'évaluation n'est pas bien défini; ce qui signifie que les valeurs incertaines comme les entrées de l'utilisateur ou les valeurs aléatoires sont difficiles à modéliser dans des langages purement fonctionnels.
## Reactif programming
La programmation réactive est un paradigme de programmation visant à conserver une cohérence d'ensemble en propageant les modifications d'une source réactive (modification d'une variable, entrée utilisateur, etc.) aux éléments dépendants de cette source.
<br/>
Une approche visant à mieux gérer les flux<br/>
Idée : dépasser les callbacks ou le patron Observer.
1. Gestion d’évènements et de l’asynchrone
2. Faible latence (contraintes sur les temps de réponse)
3. Flux de données importants (et rapides).
4. Tolérance aux fautes


## POO
La programmation orientée objet est un modèle de langage de programmation qui s'articule autour d'objets et de données, plutôt que d'actions et de logique. Par le passé, un programme était une procédure logique qui récupérait des données en entrée, les traitait puis produisait des données en sortie.