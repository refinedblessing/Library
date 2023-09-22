package org.library.queries;

public enum Books {
    GET_ALL_BOOKS("SELECT * FROM books"),
    GET_BOOK_BY_ISBN("SELECT * FROM books WHERE isbn = ?"),
    GET_BOOK_BY_ID("SELECT * FROM books WHERE id = ?"),
    DELETE_BOOK("DELETE FROM books WHERE id = ?"),
    SAVE_BOOK("INSERT INTO books(isbn, name) VALUES(?, ?)");

    private final String query;

    Books(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
}
