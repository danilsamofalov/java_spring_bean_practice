package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Island2 {

    private Wood3 wood;

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }

    @Autowired
    public void setWood(Wood3 wood) {
        this.wood = wood;
    }
}
