### Exercise

 

Our studies can have a reference code that is used to identify them. A reference code looks like this: `K7DTY-BXV6T`

(five capital letters or digits, followed by a dash, followed by five more capital letters or numbers)

 

A study can have many substudies, substudies references have the same reference code of the study plus a suffix of dash

and counter.

 

The second substudy has the reference code: `K7DTY-BXV6T-2`, the third substudy has the reference code: `K7DTY-BXV6T-3`.

 

Your task is to create a reusable piece of code that accepts a reference code of a study or substudy and returns the

reference code of the study.

 

If the reference code of the study is passed as an input, it should be returned unchanged.

 

At the beginning, you can assume that the provided reference code is always valid, but please be prepared for a few

follow-up tasks where this will change.

 

Examples:

| Input         | Output      |

----------------|-------------|

| K7DTY-BXV6T   | K7DTY-BXV6T |

| K7DTY-BXV6T-2 | K7DTY-BXV6T |

| K7DTY-BXV6T-4 | K7DTY-BXV6T |

 

**Follow-up tasks:**

1. `K7DTY-BXV6T-1` is invalid in our system, because we don’t append “-1” to the first substudy.

   Modify your module to communicate this exceptional situation to the calling code.

2. Our colleagues from operations face a lot of problems with the keyboard layouts.

   Instead of dash we receive forward slash (/). Modify your code to also accept input such as `K7DTY/BXV6T/3` and

   still return the correct result.

3. When the clients search for their study they can sometimes be really absent minded. They don’t pay too much

   attention to the upper case letters in the reference number. Modify your module to accept reference codes with

   lower case letters. The returned study reference code should still have upper case letters.

4. We have some legacy studies in our system that use the following format as the reference code:

 

   `K7DTY` (five capital letters or digits)

 

   In that case a substudy has a reference code that looks like follows: `K7DTY-2`

   Modify your module to handle the legacy studies as well.
