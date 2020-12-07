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