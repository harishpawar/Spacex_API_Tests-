package entities;

import java.util.List;

public class Flickr {
    public List<Object> small;

    public List<Object> getSmall() {
        return small;
    }

    public void setSmall(List<Object> small) {
        this.small = small;
    }

    public List<String> getOriginal() {
        return original;
    }

    public void setOriginal(List<String> original) {
        this.original = original;
    }

    public List<String> original;
}
