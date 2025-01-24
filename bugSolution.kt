fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    // Correct way to remove elements while iterating
    val list2 = mutableListOf(1,2,3,4,5)
    list2.removeAll { it > 2 }
    println(list2)
    
    //Alternative using an iterator
    val list3 = mutableListOf(1,2,3,4,5)
    val iterator = list3.iterator()
    while(iterator.hasNext()){
        if(iterator.next() > 2) iterator.remove()
    }
    println(list3)
}