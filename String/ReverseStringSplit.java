public class ReverseStringSplit {
    public static void main(String[] args) {
        String s = "Yash.Shankar.Kore";

        String[] store = s.split("\\.");
        //String rev = "";

        // Reverse loop
        for (int i = 0; i < store.length / 2; i++) {
            String temp = store[i];
            store[i] = store[store.length - 1 - i];
            store[store.length - 1 - i] = temp;
        }

        // join string
        String join = String.join(".", store);

        // for (String st : store) {
        //     // System.out.println(st);
        //     // st.join("\\.")
        // }
        System.out.println(join);

    }
}
