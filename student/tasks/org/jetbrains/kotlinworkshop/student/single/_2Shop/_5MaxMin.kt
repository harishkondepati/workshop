package org.jetbrains.kotlinworkshop.student.single._2Shop

fun main() {
    val max = listOf(1, 42, 4).max()
    val longestString = listOf("a", "ab", "b").maxBy { it.length }

    println(max) // 42
    println(longestString) // ab
}

// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? {
    return customers.maxBy { it.orders.size }
}

// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? {
    return orderedProducts.maxBy { it.price }
}
