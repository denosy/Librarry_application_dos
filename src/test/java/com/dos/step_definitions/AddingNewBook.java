package com.dos.step_definitions;

import com.dos.pages.BookManagement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddingNewBook {

    BookManagement bookManagement = new BookManagement();

    @Given("User is on the main page Book Management - User click button Books on the left top")
    public void user_is_on_the_main_page_book_management_user_click_button_books_on_the_left_top() {

        bookManagement.BooksPanelBtn.click();
    }
    @Given("User click Add Book button")
    public void user_click_add_book_button() {

        bookManagement.addBookBtn.click();

    }
    @Then("User entering book name, iSBN, Year, Author, Book category, Description")
    public void user_entering_book_name_i_sbn_year_author_book_category_description() {

        bookManagement.BookName.sendKeys("Kobzar");
        bookManagement.ISBN.sendKeys("55");
        bookManagement.year.sendKeys("2025");
        bookManagement.selectBookGroupByValue("Classic");
        bookManagement.BookDescription("This is a best book");

    }

    @Then("User click Save Changes Button")
    public void user_click_save_changes_button() {

        bookManagement.SaveNewBook.click();

    }

    @Then("User should see a pop-up window {string}")
    public void user_should_see_a_pop_up_window(String book_is_crated) {

    bookManagement.toastElement();




    }



    }


