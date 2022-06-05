/*
Enhanced for loops provide a simpler alternative to for loops when iterating over a collection or array.
The following syntax is used for enhanced for loops:

for (type x : iterable) {
    ...
}

The code blocks below are equivalent:
-------------------
for (int i = 0; i < names.length(); i++) {
    System.out.println(names[i])
}
-------------------
for (String i : names) {
    System.out.println(names[i])
}
-------------------

NOTES:
    * The enhanced for loop should not be used when replacing or removing elements during traversal
    * The enhanced for loop does not provide a way to access the current item's index
*/

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] names = {"john", "tom", "ben"};
        for (String i : names) {
            System.out.println(i);
        }
    }
}
