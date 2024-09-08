package _09_emoji_support;

public class MainApplication {

    //Some fun stuff :)
    public static void main(String[] args) {
        String messageWithEmoji = "Hello Java 21! 😄";
        String messageWithoutEmoji = "Hello Java!";

        System.out.println(messageWithEmoji);
        System.out.println(messageWithoutEmoji);

        System.out.println("Is Emoji? -> " + messageWithEmoji.codePoints().anyMatch(Character::isEmoji));


        System.out.println(Character.isEmojiModifier(0x1F3FB)); // light skin tone
        System.out.println(Character.isEmojiModifier(0x1F3FD)); // medium skin tone
        System.out.println(Character.isEmojiModifier(0x1F3FF)); // dark skin tone

        System.out.println(Character.isEmojiComponent(0x200D)); // Zero width joiner
        System.out.println(Character.isEmojiComponent(0x1F3FD)); // medium skin tone

        System.out.println(Character.isExtendedPictographic(Character.codePointAt("☀", 0))); // Sun with rays
        System.out.println(Character.isExtendedPictographic(Character.codePointAt("✔", 0))); // Checkmark
    }
}
