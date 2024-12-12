public class Hello {
    public static void main(String[] args) {
        System.out.println("Blame It on the Boogie"); // Corrected the println syntax
        String[] lyrics = {
            "Hee, hee, hee",
            "My baby's always dancin' And wouldn't be a bad thing But I don't get no lovin' And that's no lie",
            "We spent the night in Frisco At every kind of disco From that night I kissed our love goodbye",
            "Don't blame it on the sunshine Don't blame it on the moonlight Don't blame it on the good times Blame it on the boogie",
            "Don't blame it on the sunshine Don't blame it on the moonlight Don't blame it on the good times Blame it on the boogie",
            "That nasty boogie bugs me But somehow it has drugged me Spellbound rhythm gets me on my feet",
            "I've changed my life completely I've seen the lightning leave me And my baby just can't take her eyes off me",
            "Don't blame it on the sunshine Don't blame it on the moonlight Don't blame it on the good times Blame it on the boogie",
            "Don't you blame it on the sunshine Don't blame it on the moonlight Don't blame it on the good times Blame it on the boogie Woo",
            "I just can't I just can't I just can't control my feet",
            "I just can't I just can't (yeah) I just can't control (woo) my feet"
        };
        for (int i = 0; i < lyrics.length; i++) {
            System.out.println((i + 1) + ") " + lyrics[i]);
        }
    }
}
