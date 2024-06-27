public class ReferenceStudy {
    public static String getReferenceCode(String referenceCode) throws ReferenceCodeException {
        referenceCode = referenceCode.toUpperCase().replace('/', '-');    // Convert to upper case and Replace forward slashes with dashes

        String[] parts = referenceCode.split("-");

        if (parts.length == 1) { // Legacy code
            return referenceCode;
        }
        else if (parts.length == 2) {
            if ("1".equals(parts[1])) {
                throw new ReferenceCodeException("This is invalid in our system, because we don’t append “-1” to the first substudy");
            }
            if (parts[1].length() < 5)
                return parts[0];

            return referenceCode;
        }
        else if (parts.length > 2) {
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
            // Initial Testcases
            System.out.println(getReferenceCode("K7DTY-BXV6T"));
            System.out.println(getReferenceCode("K7DTY-BXV6T-2"));
            System.out.println(getReferenceCode("K7DTY-BXV6T-4"));
            System.out.println(getReferenceCode("K7DTY-2"));  // Fourth task testcase
            System.out.println(getReferenceCode("K7DTY-1"));  // Fourth task testcase
            System.out.println(getReferenceCode("k7dty-bxv6t"));  // Third task testcase
            System.out.println(getReferenceCode("k7dty-bxv6t-2"));  // Third task testcase
            System.out.println(getReferenceCode("k7dty-bxv6t-1"));  // Third task testcase
            System.out.println(getReferenceCode("K7DTY/BXV6T/5"));  // Second task testcase
            System.out.println(getReferenceCode("K7DTY/BXV6T/1"));  // Second task testcase
            System.out.println(getReferenceCode("K7DTY-BXV6T-1"));  // First task testcase
        }
        catch (ReferenceCodeException e) {
            System.err.println(e.getMessage());
        }
    }
}
