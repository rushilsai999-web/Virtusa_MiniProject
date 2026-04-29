CREATE TABLE Books (
    BookID INT PRIMARY KEY,
    Title VARCHAR(100),
    Category VARCHAR(50)
);


CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(100)
);

CREATE TABLE IssuedBooks (
    IssueID INT PRIMARY KEY,
    BookID INT,
    StudentID INT,
    IssueDate DATE,
    ReturnDate DATE,
    FOREIGN KEY (BookID) REFERENCES Books(BookID),
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID)
);


INSERT INTO Books VALUES (1, 'Data Structures', 'Science');
INSERT INTO Books VALUES (2, 'Java Programming', 'Technology');
INSERT INTO Books VALUES (3, 'World History', 'History');
INSERT INTO Books VALUES (4, 'Harry Potter', 'Fiction');
INSERT INTO Books VALUES (5, 'Database Systems', 'Technology');

INSERT INTO Students VALUES (101, 'Rushil');
INSERT INTO Students VALUES (102, 'Prajuth');
INSERT INTO Students VALUES (103, 'Suraj');
INSERT INTO Students VALUES (104, 'Naresh');
INSERT INTO Students VALUES (105, 'Tharun');

INSERT INTO IssuedBooks VALUES (1, 1, 101, '2026-03-01', NULL);
INSERT INTO IssuedBooks VALUES (2, 2, 102, '2026-04-10', '2026-04-15');
INSERT INTO IssuedBooks VALUES (3, 3, 103, '2026-03-20', NULL);
INSERT INTO IssuedBooks VALUES (4, 4, 104, '2026-04-01', '2026-04-05');
INSERT INTO IssuedBooks VALUES (5, 5, 105, '2023-01-10', '2023-01-20');

SELECT s.StudentID, s.Name, b.Title, i.IssueDate
FROM Students s
JOIN IssuedBooks i ON s.StudentID = i.StudentID
JOIN Books b ON b.BookID = i.BookID
WHERE i.ReturnDate IS NULL
AND i.IssueDate < CURRENT_DATE - INTERVAL '14' DAY;

SELECT b.Category, COUNT(*) AS TotalBorrows
FROM Books b
JOIN IssuedBooks i ON b.BookID = i.BookID
GROUP BY b.Category
ORDER BY TotalBorrows DESC;

DELETE FROM IssuedBooks
WHERE StudentID NOT IN (
    SELECT StudentID
    FROM (
        SELECT DISTINCT StudentID
        FROM IssuedBooks
        WHERE IssueDate >= CURRENT_DATE - INTERVAL 3 YEAR
    ) AS temp
);

DELETE FROM Students
WHERE StudentID NOT IN (
    SELECT DISTINCT StudentID
    FROM IssuedBooks
    WHERE IssueDate >= CURRENT_DATE - INTERVAL 3 YEAR
);
