package com.example.googlepreperation.linked_list_version_3

data class Node<T>(var value: T, var next: Node<T>? = null) {

    override fun toString(): String {
        return if (next!=null){
            "$value -> ${next.toString()}"
        }else{
            "$value"
        }
    }
}