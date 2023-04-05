package com.example.googlepreperation.linkedlist_old

class DeleteNodeAtSpecifiedPosition {

    /* Linked list Node*/
    class Node(var data: Any) {
        var next: Node? = null
    }

    private var head: Node? = null


    /* Inserts a new Node at front of the list. */
    fun push(new_data: Any) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        val new_node = Node(new_data)

        /* 3. Make next of new Node as head */new_node.next = head

        /* 4. Move the head to point to new Node */head = new_node
    }


    /* Given a reference (pointer to pointer) to the head of
       a list
       and a position, deletes the node at the given
       position */
    fun deleteNode(position: Int) {
        // If linked list is empty
        if (head == null) return

        // Store head node
        var temp = head

        // If head needs to be removed
        if (position == 0) {
            head = temp!!.next // Change head
            return
        }

        // Find previous node of the node to be deleted
        var i = 0
        while (temp != null && i < position - 1) {
            temp = temp.next
            i++
        }

        // If position is more than number of nodes
        if (temp?.next == null) return

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        val next = temp.next!!.next
        temp.next = next // Unlink the deleted node from list
    }

    /* This function prints contents of linked list starting
       from the given node */
    fun printList() {
        var tnode = head
        while (tnode != null) {
            print(tnode.data.toString() + " ")
            tnode = tnode.next
        }
    }


    class Nodes(var data: Int) {
        var next: Nodes? = null
    }
}

fun main() {

    val deleteNodeAtSpecifiedPosition = DeleteNodeAtSpecifiedPosition()
    deleteNodeAtSpecifiedPosition.push(6)
    deleteNodeAtSpecifiedPosition.push(8)
    deleteNodeAtSpecifiedPosition.push(9)
    deleteNodeAtSpecifiedPosition.push(2)
    deleteNodeAtSpecifiedPosition.push(5)

    deleteNodeAtSpecifiedPosition.printList()

    deleteNodeAtSpecifiedPosition.deleteNode(3)

    println()

    deleteNodeAtSpecifiedPosition.printList()
}

