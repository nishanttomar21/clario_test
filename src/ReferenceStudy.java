public class ReferenceStudy {
    public static String getReferenceCode(String referenceCode) throws ReferenceCodeException {
        referenceCode = referenceCode.replace('/', '-');    // Replace forward slashes with dashes

        String[] parts = referenceCode.split("-");

        if (parts.length > 2) {
            if ("1".equals(parts[2]))
                throw new ReferenceCodeException("This is invalid in our system, because we don’t append “-1” to the first substudy");

            return parts[0] + "-" + parts[1];
        }
        else {
            return referenceCode;
        }
    }

    public static void main(String[] args) throws ReferenceCodeException {
        try {
            System.out.println(getReferenceCode("K7DTY-BXV6T"));
            System.out.println(getReferenceCode("K7DTY-BXV6T-2"));
            System.out.println(getReferenceCode("K7DTY-BXV6T-4"));
            System.out.println(getReferenceCode("K7DTY/BXV6T/5"));
            System.out.println(getReferenceCode("K7DTY-BXV6T-1"));
        }
        catch (ReferenceCodeException e) {
            System.err.println(e.getMessage());
        }
    }
}
