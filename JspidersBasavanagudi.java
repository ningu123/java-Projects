Jspiders Basavanagudi
Home(current)
1
LASTDIGIT
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7. lastDigit(23, 19, 13) → true lastDigit(23, 19, 12) → false lastDigit(23, 19, 3) → true

2
OLD35
Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod old35(3) → true old35(10) → true old35(15) → false

3
MAXMOD5
Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2. maxMod5(2, 3) → 3 maxMod5(6, 2) → 6 maxMod5(3, 2) → 3

4
BLUETICKET
You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10. Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0. blueTicket(9, 1, 0) → 10 blueTicket(9, 2, 0) → 0 blueTicket(6, 1, 4) → 10

5
DATEFASHION
You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe). dateFashion(5, 10) → 2 dateFashion(5, 2) → 0 dateFashion(5, 5) → 1

6
INORDEREQUAL
Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5. inOrderEqual(2, 5, 11, false) → true inOrderEqual(5, 7, 6, false) → false inOrderEqual(5, 5, 7, true) → true

7
SQUIRRELPLAY
The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise. squirrelPlay(70, false) → true squirrelPlay(95, false) → false squirrelPlay(95, true) → true

8
SORTASUM
Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20. sortaSum(3, 4) → 7 sortaSum(9, 4) → 20 sortaSum(10, 11) → 21

9
NOTEENSUM
Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum(). noTeenSum(1, 2, 3) → 6 noTeenSum(2, 13, 1) → 3 noTeenSum(2, 1, 14) → 3

10
ROUNDSUM
For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum(). roundSum(16, 17, 18) → 60 roundSum(12, 13, 14) → 30 roundSum(6, 4, 4) → 10








