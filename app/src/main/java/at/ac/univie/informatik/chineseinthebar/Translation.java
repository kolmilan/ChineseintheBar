package at.ac.univie.informatik.chineseinthebar;

/**
 * Created by milan on 10.05.17.
 */

public class Translation {
   private String english;
   private String chinese;
   private String pinyin;
   private String image;
   private String category;

    public Translation(String english, String chinese, String pinyin, String image, String category) {
        this.english = english;
        this.chinese = chinese;
        this.pinyin = pinyin;
        this.image = image;
        this.category = category;
    }


    public String getEnglish() {
        return english;
    }
    public String getChinese() {
        return chinese;
    }
    public String getPinyin() {
        return pinyin;
    }
    public String getImage() {
        return image;
    }
    public String getCategory() {
        return category;
    }
}


