package DAO;

import Entity.Entity;
import View.View;

import java.util.ArrayList;

public class DAO {

    ArrayList<Entity> wiseList = new ArrayList<Entity>();

    View view = View.getInstance();

    private int count = 1;
    private String wise;
    private String author;

    public void register() {
        Entity entity = new Entity(count, wise, author);

        view.printOut("명언 : ");
        wise = view.stringInput();
        entity.setWise(wise);

        view.printOut("작가 : ");
        author = view.stringInput();
        entity.setAuthor(author);

        entity.setNumId(count);

        wiseList.add(entity);

        view.printlnOut(count + "번 명언이 등록되었습니다.");

        count++;
    }

    public void list() {
        view.printlnOut("================================");
        view.printlnOut("번호 / 작가 /  명언");

        int i = 0;
        while (i< wiseList.size()) {
            view.printlnOut(wiseList.get(i).toString());
            i++;
        }

        view.printlnOut("================================");
    }

    public void delete() {
        view.printOut("삭제할 명언의 번호를 입력해주세요 : ");
        int inputNum = view.intInput();
        view.stringInput();

        boolean check = false;

        for (int i = 0; i < wiseList.size(); i++) {
            if (wiseList.get(i).getNumId() == inputNum) {
                wiseList.remove(i);
                view.printlnOut(inputNum + "번 명언이 삭제되었습니다.");
                check = true;
            }
        }

        if (check == false) {
            view.printlnOut(inputNum + "번 명언은 존재하지 않습니다.");
        }
    }

    public void change() {
        Entity entity = new Entity(count, wise, author);

        view.printOut("수정할 명언의 번호를 입력해주세요 : ");
        int inputNum = view.intInput();
        view.stringInput();

        boolean check = false;

        for (int i = 0; i < wiseList.size(); i++ ) {
            if (wiseList.get(i).getNumId() == inputNum) {
                view.printOut("수정할 명언 : ");
                wise = view.stringInput();

                view.printOut("수정할 작가 : ");
                author = view.stringInput();

                entity.setNumId(inputNum);
                entity.setWise(wise);
                entity.setAuthor(author);

                wiseList.set(i, entity);

                view.printlnOut(inputNum + "번 명언이 수정되었습니다.");
                check = true;
            }
        }

        if (check == false) {
            view.printlnOut(inputNum + "번 명언은 존재하지 않습니다.");
        }
    }
}
