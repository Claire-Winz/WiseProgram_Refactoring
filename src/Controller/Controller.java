package Controller;

import DAO.DAO;
import View.View;

public class Controller {

    View view = new View();

    DAO dao = new DAO();

    public void run() {

        view.printlnOut("======  명언 메모 앱  ======");

        while (true) {
            view.printlnOut("------  명령어 리스트  ------");
            view.printlnOut(" 1.등록 2.목록 3.삭제 4.수정 5.종료");
            view.printOut("명령어나 원하는 명령의 번호를 입력해 주세요. >>");

            switch (view.stringInput()) {

                case "등록" : case "1" :
                    dao.register();
                    break;

                case "목록" : case "2" :
                    dao.list();;
                    break;

                case "삭제" : case "3" :
                    dao.delete();
                    break;

                case "수정" : case "4" :
                    dao.change();
                    break;

                case "종료" : case "5" :
                    return;
            }
        }
    }
}
