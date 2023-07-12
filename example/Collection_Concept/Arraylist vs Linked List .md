Title: Linked List and its Methods

1. Linked List Overview:
   - Linked lists are a dynamic data structure that can grow and shrink as needed.
   - They are well-suited for scenarios where the size of the data set is unknown.
   - Linked lists are not as efficient as arrays for accessing elements by index.
   - However, they are more efficient for insertion and deletion operations.
   - Linked lists can be used to implement stacks, queues, and linked lists themselves.

2. Inheritance Hierarchy:
   - Linked List is a class that inherits methods from different interfaces.
   - The inheritance hierarchy is as follows:
     - a. Linked List class inherits methods from the Collection interface (Root or Parent).
     - b. Linked List class implements the List interface (Child of Collection interface).
     - c. Linked List class implements the Deque interface (Child of Queue interface).

3. ArrayList vs. Linked List:
   - ArrayList is suitable for frequent retrieval of elements but not for frequent insertion or deletion.
   - Linked List is mainly used for insertion and deletion operations.
   - ArrayList stores values consecutively, while Linked List stores elements randomly and connects them through addresses.

4. Linked List Structure:
   - Each element in a linked list is called a node.
   - Each node has three parts:
     1. Previous Element Address (Left side).
     2. Element Value.
     3. Next Element Address (Right side).
   - Nodes are connected to form the linked list structure.

5. Limitation of Linked List:
   - Linked lists are not recommended for scenarios with a large number of retrievals.
   - Accessing elements by index requires traversing the list from the beginning, which affects performance.

6. Linked List Methods:
   - Add(x): Adds an element at the end of the linked list.
   - Add(index, y): Inserts an element at a specific position in the linked list.
   - AddAll(Collection): Adds a collection of elements to the linked list.
   - Remove(x): Removes a specific element from the linked list.
   - Remove(index): Removes the element at a specific index from the linked list.
   - RemoveAll(Collection): Removes a specific collection of elements from the linked list.
   - Get(index): Retrieves the element at a specific index in the linked list.
   - Get(x): Retrieves a specific element from the linked list.
   - Set(index, object): Replaces the element at a specific index with a new object.
   - Collections.sort(): Sorts the linked list.
   - Collections.shuffle(): Shuffles the elements in the linked list.

7. Special Methods for Stacks and Queues:
   - addFirst(object): Adds an element to the first position of the linked list.
   - addLast(object): Adds an element to the last position of the linked list.
   - removeFirst(): Removes the element from the first position of the linked list.
   - removeLast(): Removes the element from the last position of the linked list.
   - getFirst(): Retrieves the element from the first position of the linked list.
   - getLast(): Retrieves the element from the last position of the linked list.

Diagram:
                            Collection Interface (Root or Parent)
                                     | (Inherited methods)
                                     |
                                 List Interface
                                     | (Inherited methods)
                                     |
                                Queue Interface
                                     | (Extended interface)
                                     |
                              DQue Interface
                                     | (Extended interface)
                                     |
                           Linked List Class
                              | (Implements methods)
                              |
                           Linked List Object
