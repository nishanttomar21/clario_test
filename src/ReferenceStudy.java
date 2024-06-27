public class ReferenceStudy {
    public static String getReferenceCode(String referenceCode) {
        String[] parts = referenceCode.split("-");

        if (parts.length > 2) {
            return parts[0] + "-" + parts[1];
        } else {
            return referenceCode;
        }
    }

    public static void main(String[] args) {
        System.out.println(getReferenceCode("K7DTY-BXV6T"));
        System.out.println(getReferenceCode("K7DTY-BXV6T-2"));
        System.out.println(getReferenceCode("K7DTY-BXV6T-4"));
    }
}
