## Pattern Observer

L'id�e est simple. Un objet (observable) peut avoir un attribut ou un comportement qui en cas de changement peut int�resser d'autres objets (observer).

Ces derniers doivent effectuer des traitements en fonction de ce changement.

Le design pattern Observer suit le principe de "publish-subscribe".

Ainsi, le besoin consiste � ce que l'observable notifie tout changement de son �tat aux objets abonn�s (observers) qui � leur tour effectuent les traitements ad�quats.

Comme vous allez le constater, ces traitements sont effectu�s de mani�re compl�tement d�coupl�e: l'observable n'a aucune id�e de ce que va faire les observers!

Le premier objet est nomm� � observable � et les objets abonn�s sont nomm�s � observer �.

Le r�le de l'observable est double :

Permettre l'abonnement (ou d�sabonnement) des objets int�ress�s. C'est pour cela qu'il maintient une liste des observers,
Notifier les observers abonn�s du changement de l'�tat.
On peut ajouter/retirer un observateur � tout moment sans affecter le code existant.

## Pattern Decorator

Le pattern D�corator est un design pattern (patron de conception) de structure qui fait partie des design pattern du GoF (Gang of Four).
Decorator nous permet d�ajouter des fonctionnalit�s nouvelles � une classe de fa�on dynamique sans impacter les classes qui l�utilisent ou en h�ritent