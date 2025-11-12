select * from books;

select * from book_borrow;

select name, author
from book_categories BC join books B
ON BC.id = B.id;

