INSERT INTO public.books(isbn, qty, description, image_path, pages, published_date, publisher, rating, title)
VALUES ('9788131722428', 20, 'This is the eBook version of the printed book. If the print book includes a CD-ROM, this content is not included within the eBook version.', 'http://books.google.com/books/content?id=kvZEJ9-Hqb0C&printsec=frontcover&img=1&zoom=0&source=gbs_api', 300, 2000,'Pearson Education India', 4, 'The Pragmatic Programmer');
INSERT INTO public.books(isbn, qty, description, image_path, pages, published_date, publisher, rating, title)
VALUES ('9780132350884', 10, 'Looks at the principles and clean code, includes case studies showcasing the practices of writing clean code, and contains a list of heuristics and "smells" accumulated from the process of writing clean code.', 'http://books.google.com/books/content?id=hjEFCAAAQBAJ&printsec=frontcover&img=1&zoom=0&source=gbs_api', 300, '2000','Pearson Education', 4, 'Clean Code');
INSERT INTO public.books(isbn, qty, description, image_path, pages, published_date, publisher, rating, title)
VALUES ('1484241339', 5, 'Use the solutions provided in this book to handle common challenges in Xamarin.Forms that are encountered on a daily basis. Working examples and techniques are presented that you can modify and drop directly into your own projects. ', 'http://books.google.com/books/content?id=5odsuwEACAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api', 250, '2009','Apress', 4.5, 'Xamarin.Forms Solutions');
INSERT INTO public.books(isbn, qty, description, image_path, pages, published_date, publisher, rating, title)
VALUES ('013394302X', 2, 'For courses in computer programming. Evaluating the Fundamentals of Computer Programming Languages Concepts of Computer Programming Languages introduces students to the fundamental concepts of computer programming languages and provides them with the tool', 'http://books.google.com/books/content?id=Wv6toQEACAAJ&printsec=frontcover&img=1&zoom=1&source=gbs_api', 792, '2015-02-06','Addison-Wesley', 3, 'Concepts of Programming Languages');

INSERT INTO public.book_authors(book_isbn, authors)
VALUES ('9788131722428', 'Hunt');
INSERT INTO public.book_authors(book_isbn, authors)
VALUES ('9780132350884', 'Robert C. Martin');
INSERT INTO public.book_authors(book_isbn, authors)
VALUES ('1484241339', 'Gerald Versluis');
INSERT INTO public.book_authors(book_isbn, authors)
VALUES ('1484241339', 'Steven Thewissen');
INSERT INTO public.book_authors(book_isbn, authors)
VALUES ('013394302X', 'Robert W. Sebesta');

INSERT INTO public.course(id, course_name, link) 
VALUES (0, 'ASP.NET Core MVC, Quick and Practical', 'https://www.udemy.com/course/aspnet-core-mvc-quick-and-practical/');
INSERT INTO public.course(id, course_name, link) 
VALUES (1, 'Introducing Spring Boot', 'https://www.udemy.com/course/spring-boot-getting-started/');
INSERT INTO public.course(id, course_name, link) 
VALUES (2, 'Advanced Databases and SQL Querying', 'https://www.udemy.com/course/advanced-tsql-querying-using-sql-2014/');
INSERT INTO public.course(id, course_name, link) 
VALUES (3, 'DevOps Essentials', 'https://www.udemy.com/course/linux-academy-devops-essentials/');

INSERT INTO public.document( id, document_name, link)
VALUES (4, 'Закон за работните односи-пречистен текст', 'http://www.mtsp.gov.mk/content/pdf/zakoni/ZRO%20Precisten%2074-15.pdf');
INSERT INTO public.document( id, document_name, link)
VALUES (5, 'Прирачник за вработени ', 'http://www.crpm.org.mk/wp-content/uploads/2019/07/Employees-Guide-CRPM-final.pdf');
INSERT INTO public.document( id, document_name, link)
VALUES (6, 'Договор за работа', 'http://www.partner.com.mk/alb/images/stories/dokumenti/Dogovor%20za%20rabota.pdf');

INSERT INTO public.resource(id, description, image, name, resource_type)
VALUES (7, 'A notebook is a book or stack of paper pages that are often ruled and used for purposes such as recording notes or memoranda, other writing, drawing or scrapbooking.', 'https://5.imimg.com/data5/UR/GI/MY-42504952/spiral-paper-notebook-500x500.jpg', 'Notebook', 1);
INSERT INTO public.resource(id, description, image, name, resource_type)
VALUES (8, 'An office chair, or desk chair, is a type of chair that is designed for use at a desk in an office. It is usually a swivel chair, with a set of wheels for mobility and adjustable height.', 'https://www.ikea.com/us/en/images/products/markus-office-chair__0724707_PE734589_S5.JPG?f=s', 'Office chair', 0);
INSERT INTO public.resource(id, description, image, name, resource_type)
VALUES (9, 'A desk or bureau is a piece of furniture with a flat table-style work surface used in a school, office, home or the like for academic, professional or domestic activities such as reading, writing, or using equipment such as a computer.', 'https://cdn.shopify.com/s/files/1/0557/6461/products/bach_lowres_1024x1024@2x.jpg?v=1554686215', 'Office desk', 0);
INSERT INTO public.resource(id, description, image, name, resource_type)
VALUES (10, 'A whiteboard is a glossy, usually white surface for making nonpermanent markings. Whiteboards are analogous to blackboards, but with a smoother surface allowing rapid marking and erasing of markings on their surface.', 'https://s3-ap-southeast-2.amazonaws.com/wc-prod-pim/JPEG_1000x1000/JBMOBWB129_j_burrows_mobile_whiteboard_with_flipchart_1200_x_900mm.jpg', 'Whiteboard', 0);
INSERT INTO public.resource(id, description, image, name, resource_type)
VALUES (11, 'A paper clip (or sometimes paperclip) is a device used to hold sheets of paper together, usually made of steel wire bent to a looped shape (though some are covered in plastic). ', 'https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Wanzijia.jpg/800px-Wanzijia.jpg', 'Paper clip', 1);
INSERT INTO public.resource(id, description, image, name, resource_type)
VALUES (12, 'Rubber stamping, also called stamping, is a craft in which some type of ink made of dye or pigment is applied to an image or pattern that has been carved, molded, laser engraved or vulcanized, onto a sheet of rubber.', 'https://upload.wikimedia.org/wikipedia/commons/thumb/d/dc/RubberStamp_blank.jpg/220px-RubberStamp_blank.jpg', 'Rubber stamp', 1);

INSERT INTO public.restaurant(id, image, name, price_range)
VALUES (13, 'https://data.whicdn.com/images/342103504/original.jpg', 'Royal Burger', 1);
INSERT INTO public.restaurant(id, image, name, price_range)
VALUES (14, 'https://media-cdn.tripadvisor.com/media/photo-s/14/b9/02/b3/fast-food-menu.jpg', 'Pizza Morino Skopje', 1);
INSERT INTO public.restaurant(id, image, name, price_range)
VALUES (15, 'https://www.tobaccofreenow.org/wp-content/uploads/t-burg-deli-brochure-page1-printable-fast-food-menus-amazing-image-ideas-for-color-pages-menu-shur-672x519.jpg', 'Subzy', 2);


INSERT INTO public.calendar(id, all_day, calendar_event_type, color, description, end_date, start_date, title)
VALUES (16, false, 1, '#004266', 'Team Delta will have SCRUM', '2020-04-17 12:15', '2020-04-13 12:00', 'SCRUM ');
INSERT INTO public.calendar(id, all_day, calendar_event_type, color, description, end_date, start_date, title)
VALUES (17, false, 3, '#4dc7df', 'Team meeting', '2020-04-27 18:00', '2020-04-27 00:30', 'Conference room busy');
INSERT INTO public.calendar(id, all_day, calendar_event_type, color, description, end_date, start_date, title)
VALUES (18, true, 2, '#ffa73e', 'Today is Blagojche\'s birthday', '2020-05-08 00:00', '2020-05-07 00:00', 'Blagojche\'s birthday');
INSERT INTO public.calendar(id, all_day, calendar_event_type, color, description, end_date, start_date, title)
VALUES (19, false, 1, '#004266', 'Team Hureko will have SCRUM', '2020-05-16 00:30', '2020-05-11 00:00','SCRUM ');
INSERT INTO public.calendar(id, all_day, calendar_event_type, color, description, end_date, start_date, title)
VALUES (20, true, 0, '#e04e2d', 'Free day', '2020-05-29 00:00', '2020-05-28 00:00', 'Macedonian country holiday');