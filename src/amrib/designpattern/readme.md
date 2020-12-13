## Pattern Observer

L'idée est simple. Un objet (observable) peut avoir un attribut ou un comportement qui en cas de changement peut intéresser d'autres objets (observer).

Ces derniers doivent effectuer des traitements en fonction de ce changement.

Le design pattern Observer suit le principe de "publish-subscribe".

Ainsi, le besoin consiste à ce que l'observable notifie tout changement de son état aux objets abonnés (observers) qui à leur tour effectuent les traitements adéquats.

Comme vous allez le constater, ces traitements sont effectués de manière complètement découplée: l'observable n'a aucune idée de ce que va faire les observers!

Le premier objet est nommé « observable » et les objets abonnés sont nommés « observer ».

Le rôle de l'observable est double :

Permettre l'abonnement (ou désabonnement) des objets intéressés. C'est pour cela qu'il maintient une liste des observers,
Notifier les observers abonnés du changement de l'état.
On peut ajouter/retirer un observateur à tout moment sans affecter le code existant.

## Pattern Decorator

Le pattern Décorator est un design pattern (patron de conception) de structure qui fait partie des design pattern du GoF (Gang of Four).
Decorator nous permet d’ajouter des fonctionnalités nouvelles à une classe de façon dynamique sans impacter les classes qui l’utilisent ou en héritent