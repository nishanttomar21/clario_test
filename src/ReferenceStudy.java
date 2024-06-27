public class ReferenceStudy {
    public static String getReferenceCode(String referenceCode) {
        String[] parts = referenceCode.split("-");

        if (parts.length > 2) {
            return parts[0] + "-" + parts[1];
        } else {
            return referenceCode;
        }
    }
}
