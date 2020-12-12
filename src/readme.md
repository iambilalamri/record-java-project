## Definition of Big O notation
1. A mathematical notation that describes the limiting behavior of a function when the argument tends towards a particular value or infinity <br/>
2. We use Big O to describe the performance of an algorithm <br/>

[Time complexity](https://adrianmejia.com/most-popular-algorithms-time-complexity-every-programmer-should-know-free-online-tutorial-course/)

## Linked List

LinkedList sont des structures de donn�es lin�aires o� les �l�ments ne sont pas stock�s dans des emplacements contigus et chaque �l�ment est un objet s�par� avec une partie de donn�es et une partie d'adresse. Les �l�ments sont li�s � l'aide de pointeurs et d'adresses. Chaque �l�ment est appel� un n�ud.<br/>
En termes simples, une liste cha�n�e se compose de n�uds o� chaque n�ud contient un champ de donn�es et une r�f�rence (lien) vers le n�ud suivant dans la liste<br/><br/>
Images de la site de GeeksforGeeks: [Linked List](https://www.geeksforgeeks.org/data-structures/linked-list/)
<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/Linkedlist.png" />
## Vocabilary
1. Post-Increment : Value is first used for computing the result and then incremented: index++
2. Pre-Increment : Value is incremented first and then result is computed: ++index

`count--;`<br/>
`return items[count];`<br/>

`return items[--count];`

## Stack (LIFO)
La classe Stack  mod�lise et impl�mente une structure de donn�es Stack . La classe est bas�e sur le principe de base du dernier entr�, premier sorti. En plus des op�rations push et pop de base, la classe fournit trois autres fonctions: vide, recherche et aper�u. On peut �galement dire que la classe �tend Vector et traite la classe comme une pile avec les cinq fonctions mentionn�es. La classe peut �galement �tre appel�e la sous-classe de Vector

## Queue (FIFO)
Queue en Java est une structure de donn�es ordonn�e lin�aire qui suit l'ordre FIFO (premier entr�, premier sorti) des �l�ments. Cela signifie que l'�l�ment ins�r� en premier dans la file d'attente sera le premier �l�ment � �tre supprim�. En Java, la file d'attente est impl�ment�e comme une interface qui h�rite de l'interface Collection.<br/>

Type de Queue: Priority Queue


## Hash Table
Une table de hachage est, en informatique, une structure de donn�es qui permet une association cl�valeur, c'est-�-dire une impl�mentation du type abstrait tableau associatif. Son but principal est de permettre de retrouver une cl� donn�e tr�s rapidement, en la cherchant � un emplacement de la table correspondant au r�sultat d'une fonction de hachage calcul�e en O(1). Cela constitue un gain de temps tr�s important pour les grosses tables, lors d'une recherche ou d'un besoin d'acc�s aux donn�es en utilisant la cl� d�finie.

1. javascript: Object
2. Java: HashMap
3. Python: Dictionnary

## Circular Arrays
Un tableau est appel� circulaire (Circular array) si nous consid�rons le premier �l�ment comme le suivant du dernier �l�ment. Les tableaux circulaires sont utilis�s pour impl�menter la file d'attente.

## Functional Programming
Le principe g�n�ral de la programmation fonctionnelle est
de concevoir des programmes comme des fonctions
math�matiques que l'on compose entre elles. A la diff�rence
des programmes imp�ratifs organis�s en instructions
produisent des effets de bords, les programmes fonctionnels
sont b�tis sur des expressions dont la valeur est le r�sultat du
programme. En particulier dans un langage fonctionnel, il
n'existe pas d'effet de bord.<br/>
Un programme fonctionnel consiste en une expression E
(repr�sentant l'algorithme et les entr�es). Cette expression E
est sujette � des r�gles de r��criture : la r�duction consiste
en un remplacement d'une partie de programme fonctionnel
par une autre partie de programme selon une r�gle de
r��criture bien d�finie. Ce processus de r�duction sera r�p�t�
jusqu'a l'obtention d'une expression irr�ductible (aucune
partie ne peut �tre r��crite). L'expression E* ainsi obtenue
est appel�e forme normale (fn) de E et constitue la sortie du
programme.<br/>
Exemple : SQR 3+2

## Procedural Programming
Une proc�dure, aussi appel�e routine, sous-routine ou fonction (� ne pas confondre avec les fonctions de la programmation fonctionnelle reposant sur des fonctions math�matiques), contient simplement une s�rie d'�tapes � r�aliser. N'importe quelle proc�dure peut �tre appel�e � n'importe quelle �tape de l'ex�cution du programme, y compris � l'int�rieur d'autres proc�dures, voire dans la proc�dure elle-m�me (r�cursivit�).<br/><br/>

La programmation proc�durale est un meilleur choix qu'une simple programmation s�quentielle. Les avantages sont en effet les suivants 

1. La possibilit� de r�utiliser le m�me code � diff�rents emplacements dans le programme sans avoir � le retaper (factorisation), ce qui a pour effet la r�duction de la taille du code source et un gain en localit� des modifications, donc une am�lioration de la maintenabilit� (compr�hension plus rapide, r�duction du risque de r�gression);
2. Une fa�on plus simple de suivre l'ex�cution du programme : la programmation proc�durale permet de se passer d'instructions telles que goto, �vitant ainsi bien souvent de se retrouver avec un programme compliqu� qui part dans toutes les directions (appel� souvent � programmation spaghetti�) ; cependant, la programmation proc�durale permet les � effets de bord �, c'est-�-dire la possibilit� pour une proc�dure qui prend des arguments de modifier des variables ext�rieures � la proc�dure auxquelles elle a acc�s (variables de contexte plus global que la proc�dure).

## Diff PP 
un langage fonctionnel (id�alement) vous permet d'�crire une fonction math�matique, c.-�-d. une fonction qui prend n arguments et renvoie une valeur. Si le programme est ex�cut�, cette fonction est logiquement �valu�e comme n�cessaire. 1

un langage proc�dural, d'autre part, ex�cute une s�rie de s�quentielle pas. (Il y a une fa�on de transformer la logique s�quentielle en logique fonctionnelle appel�e continuation passing style .)

par cons�quent, un programme purement fonctionnel donne toujours la m�me valeur pour une entr�e, et l'ordre d'�valuation n'est pas bien d�fini; ce qui signifie que les valeurs incertaines comme les entr�es de l'utilisateur ou les valeurs al�atoires sont difficiles � mod�liser dans des langages purement fonctionnels.
## Reactif programming
La programmation r�active est un paradigme de programmation visant � conserver une coh�rence d'ensemble en propageant les modifications d'une source r�active (modification d'une variable, entr�e utilisateur, etc.) aux �l�ments d�pendants de cette source.
<br/>
Une approche visant � mieux g�rer les flux<br/>
Id�e : d�passer les callbacks ou le patron Observer.
1. Gestion d��v�nements et de l�asynchrone
2. Faible latence (contraintes sur les temps de r�ponse)
3. Flux de donn�es importants (et rapides).
4. Tol�rance aux fautes


## POO
La programmation orient�e objet est un mod�le de langage de programmation qui s'articule autour d'objets et de donn�es, plut�t que d'actions et de logique. Par le pass�, un programme �tait une proc�dure logique qui r�cup�rait des donn�es en entr�e, les traitait puis produisait des donn�es en sortie.