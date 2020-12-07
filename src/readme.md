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