1. Try using a `TreeMap` and a `HashMap` instead of `MyHashMap`. Are the resulting word frequencies any different?
Is the time performance any different? If so, how would you rank the three implementations (in increasing order of time complexity)?

I did not encounter a difference in word frequencies. However, I ran each implementation 4 times and the average were Hashmap: 1138 TreeMap: 1302, MyHashMap: 5360.
Fastest to slowest: Hashmap, TreeMap, MyHashMap

2. How are `%` and `Math.floorMod` different? Which works more reliably for computing a hash table index?

3. What is the time complexity of `MyHashMap.size()`, and how could you make it much more efficient?
Time complexity is linear and to make it more efficient keep count of the size every time you add or remove.

4. How does this implementation compare to one where you would directly use your linked `Node` class from the earlier assignment?
Answer briefly in terms of ease of implementation, correctness, reliability, and performance.
HashMap allows you to iterator through short lists while linked 'Node' you have to iterator through the whole list in order to add or remove. Making performance better
through a HashMap.