Describe the bug

When editing xhtml one (i.e. personEdit.xhtml for personal information collection), navigate to other edit xhtml (addressEdit.zhtml for personal address information collection) by back end controller with commandButton. Then input address values into form in addressEdit.xhtml, when finished, press save button to save address and update person information by adding personal address ID to personal information, then return back to personEdit.xhtml from back end controller.

Unfortunately, personEdit.xhtml can display properly with updated address information (AddressID), but all fields in personEdit.xhtml is not activated to accept values, when click on any inputtext field, the text field is lightly highlighted (with light blue border of the text field) but there is no cursor in the text field at all.

This will cause navigated back personEdit.xhtml not work at all.

I created a simple jakarta ee project with primefaces 15.0.4 on github, please find it from https://github.com/cidylong/primefaces, it can be check out and compile by netbeans, then deploy it to payara server.

Reproducer

Please pull https://github.com/cidylong/primefaces and install it into your payara server. I tried it on Payara7.2025.1alpha1

When deploy success, go to index.xhtml. clicks menus - [Persons] -> click menuitem [New Person],

System will display personEdit.xhtml, you can input firstName or something else.

When click button [New Address], system will take you to next editing xhtml -- addressEdit.xhtml,

input the information you like, then press [save] button. System will save your inputted information and bring you back to personEdit.xhtml page.

personEdit.xhtml will display the addressId you just inputted in addressEdit.xhtml in linked address field.

When you tried to keep editing personEdit.xhtml, you will found there is no one field is activated to accept values at all, there is no cursor in the input text field when click the field.

Expected behavior

This is very common requirement for developers to jump around to edit multiple components in the same context, and some time the complexed components maybe break into multiple tabs in tab view to update each other in order.

PrimeFaces edition

Community

PrimeFaces version

15.0.4

Theme

default

JSF implementation

Mojarra

JSF version

4.1

Java version

21

Browser(s)

Version 18.5 (20621.2.5.11.8) safari on MacOS 15.5
