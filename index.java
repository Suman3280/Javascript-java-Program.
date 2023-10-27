import java.util.Random;

public class ShuffleArray {
    public static void shuffleArray(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static int romanToInteger(String roman) {
        int result = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            int value = romanValue(roman.charAt(i));
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }

        return result;
    }

    private static int romanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static boolean isPangram(String sentence) {
        int[] alphabet = new int[26];

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = Character.toLowerCase(c) - 'a';
                alphabet[index] = 1;
            }
        }

        for (int i : alphabet) {
            if (i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(arr);
        System.out.print("Shuffled Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        String romanNumeral = "IX";
        int integerEquivalent = romanToInteger(romanNumeral);
        System.out.println(romanNumeral + " = " + integerEquivalent);

        String pangram = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(pangram);
        System.out.println("Is Pangram? " + isPangram);
    }
}

function reverseWords(sentence) {
    let words = sentence.split(' ');
    let reversedWords = [];

    for (let word of words) {
        let reversedWord = '';
        for (let i = word.length - 1; i >= 0; i--) {
            reversedWord += word[i];
        }
        reversedWords.push(reversedWord);
    }

    return reversedWords.join(' ');
}

function descendingSort(arr) {
    for (let i = 0; i < arr.length - 1; i++) {
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[i] < arr[j]) {
                let temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr;
}

const sentence = "This is a sunny day";
const reversedSentence = reverseWords(sentence);
console.log(reversedSentence);

const numbers = [5, 2, 9, 1, 5, 6];
const sortedArray = descendingSort(numbers);
console.log(sortedArray);
