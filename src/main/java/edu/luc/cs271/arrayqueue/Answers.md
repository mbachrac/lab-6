# Answers to Lab 6 Questions:

# Malka Bracha
**1.** FixedArrayQueue needs an explicit constructor because we have to set each thing i.e. capacity, data, size, front, and rear according to our specific first values.

**2.** If you offer an item to a full FixedArrayQueue, it won't add it because the method returns false right away and does not do anything else.

**3.** If you poll an empty FixedArrayQueue, the method returns null because there is nothing to pull out to show to the user.

**4.** For both time and space, Offer(), Poll(), Peek(), isEmpty(), and Size() are all O(1). The asList() method is O(n).