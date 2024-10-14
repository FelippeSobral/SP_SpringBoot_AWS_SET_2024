package Services;


import DAO.BookDAO;

public class BookServices {

    public static class BookService {
        private BookDAO bookDAO;

        public BookService() {
            this.bookDAO = new BookDAO();
        }

        public void createBooks() {
            bookDAO.createBooks();
        }

        public void deleteBook() {
            bookDAO.deleteBook();
        }

        public void updateBook() {
            bookDAO.updateBook();
        }

        public void findBooksByAuthor() {
            bookDAO.findBooksByAuthor();
        }

        public void findBooksByYear() {
            bookDAO.findBooksByYear();
        }
    }


}
