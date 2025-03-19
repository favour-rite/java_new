public class ConcatenatesListAlternatingly{


    public static int combineListsAlternatively(list1, list2) {

        result = new ArrayList();
        int length = Math.max(list1.size(), list2.size());
        
        for (int count = 0; count < maxLength; count++) {

            if (count < list1.size()) {
                result.add(list1.get(count));
            }

            if (count < list2.size()) {
                result.add(list2.get(count));
            }
        }

        
        return result;
    }

    public static void main(String[] args) {
	list1 = ("a","b","c"));
        list2 = ((1, 2, 3));
        
        System.out.println(combineListsAlternatively(list1, list2));
    }
}

 





















