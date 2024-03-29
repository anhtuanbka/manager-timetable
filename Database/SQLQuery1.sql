use master
go
drop database [Project]
go
CREATE DATABASE [Project]
GO
USE [Project]
GO

CREATE TABLE [SUBJECTS]
(
	[SUBJECT_ID] CHAR(20) PRIMARY KEY NOT NULL,
	[SUBJECT_NAME] NVARCHAR(50) UNIQUE NOT NULL,
	[MASTER_SUBJECT] NVARCHAR (50) NOT NULL,
)
GO
CREATE TABLE [ROOMTYPES]
(
	[TYPE_ID] INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	[TYPE_NAME] NVARCHAR(30) UNIQUE NOT NULL,
)
GO
CREATE TABLE [ROOMS]
(
	[ROOM_ID] CHAR(20) PRIMARY KEY NOT NULL,
	[TYPE_ID] INT FOREIGN KEY([TYPE_ID]) REFERENCES [ROOMTYPES]([TYPE_ID]) ON DELETE CASCADE,
	[STATUS] BIT NOT NULL,/* Active or Not Active*/
)
GO
CREATE TABLE [DEVICES]
(
	[DEVICE_ID] INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	[DEVICE_NAME] NVARCHAR(30),
	[DESCRIPTION] NVARCHAR(100)
)
GO
CREATE TABLE [DEVICESINROOM]
(
	[DEVICESINROOM_ID] INT IDENTITY(1,1) PRIMARY KEY,
	[ROOM_ID] CHAR(20) FOREIGN KEY ([ROOM_ID]) REFERENCES [ROOMS]([ROOM_ID]) ON DELETE CASCADE,
	[DEVICE_ID] INT FOREIGN KEY ([DEVICE_ID]) REFERENCES [DEVICES]([DEVICE_ID]),
	[QUANTITY] INT,
	[STATUS] BIT
)
GO
CREATE TABLE [TIME_ROOM]
(
	[TIME_ID] INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	[ROOM_ID] CHAR(20) FOREIGN KEY ([ROOM_ID]) REFERENCES [ROOMS]([ROOM_ID]) ON DELETE CASCADE,
	[DAY] TINYINT NOT NULL,
	[LESSION_START] INT,
	[LESSION_END] INT,
	UNIQUE(ROOM_ID,DAY,LESSION_START,LESSION_END)
)
GO
CREATE TABLE [TIMETABLE]
(	[TIME_ID] INT FOREIGN KEY ([TIME_ID]) REFERENCES [TIME_ROOM]([TIME_ID]) ON DELETE CASCADE,
	PRIMARY KEY ([TIME_ID]),
	[SUBJECT_ID] CHAR(20) FOREIGN KEY ([SUBJECT_ID]) REFERENCES [SUBJECTS]([SUBJECT_ID]) ON DELETE CASCADE,
	[MAX_STUDENTS] INT NOT NULL,
	[REGISTED] INT ,
	
)
GO
CREATE TABLE [USERS]
(
	[ID] INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	[USERNAME] NVARCHAR(50) UNIQUE,
	[PASSWORD] VARCHAR(50),
	[ENAME] NVARCHAR(50),
	[PHONE] VARCHAR(20),
	[ADDRESS] TEXT,
	[ADMIN] BIT,

)
GO
--INSERT USER--------------------------------------------------------------------
INSERT INTO USERS (USERNAME,PASSWORD,ENAME,PHONE,ADDRESS,ADMIN)
VALUES	('admin','admin','admin','0913290333','',1),
		('canh','1234567','Vu Duc Canh','0913290333','Nam Dinh',0),
		('hiep','1234567','Nguyen Thanh Hiep','0913290333','Thanh Hoa',0),
		('cuong','1234567','Le Phu Cuong','0913290333','Thanh Hoa',0)
---------------------------------------------------------------------------------		
GO
--INSERT SUBJECT--------------------------------------------------------------------
INSERT INTO SUBJECTS (SUBJECT_ID,SUBJECT_NAME,MASTER_SUBJECT)
VALUES	('SSH1110',N'Những NLCB của CN Mác-Lênin I',N'Lý luận chính trị'),
		('SSH1050',N'Tư tưởng Hồ Chí Minh',N'Lý luận chính trị'),
		('PE1010',N'Giáo dục thể chất A',N'Giáo dục thể chất'),
		('PE1020',N'Giáo dục thể chất B',N'Giáo dục thể chất'),
		('QT0011',N'Tiếng Anh A1 (200 tiết)',N'Ngoại ngữ (Anh)'),
		('QT0021',N'Tiếng Anh A2 (200 tiết)',N'Ngoại ngữ (Anh)'),
		('MI1110',N'Giải tích 1',N'Toán và khoa học cơ bản'),
		('MI1120',N'Giải tích 2',N'Toán và khoa học cơ bản'),
		('IT3670',N'Nhập môn Java',N'Cơ sở và cốt lõi ngành'),
		('IT3070',N'Hệ điều hành',N'Cơ sở và cốt lõi ngành'),
		('IT3080',N'Mạng máy tính',N'Cơ sở và cốt lõi ngành')
-------------------------------------------------------------------------------------
GO
--INSERT ROOMTYPES-------------------------------------------------------------------
INSERT INTO ROOMTYPES (TYPE_NAME)
VALUES	(N'Lý thuyết'),
		(N'Thực hành'),
		(N'Phòng Lab'),
		(N'Thí nghiệm')
-------------------------------------------------------------------------------------
GO
--INSERT ROOM------------------------------------------------------------------------
INSERT INTO ROOMS (ROOM_ID,TYPE_ID,STATUS)
VALUES	('D7.301',1,1),
		('D7.402',2,1),
		('D9.304',3,0),
		('D3.204',4,1)
-------------------------------------------------------------------------------------
GO
--INSERT TIME ROOM-------------------------------------------------------------------
INSERT INTO TIME_ROOM (ROOM_ID,DAY,LESSION_START,LESSION_END)
VALUES	('D7.301',2,1,6),
		('D7.301',2,7,10),
		('D7.402',3,1,3),
		('D7.402',3,4,5),
		('D3.204',4,7,8)
-------------------------------------------------------------------------------------
GO
--INSERT TIME TABLE------------------------------------------------------------------
INSERT INTO TIMETABLE (TIME_ID,SUBJECT_ID,MAX_STUDENTS,REGISTED)
VALUES	(1,'SSH1110',60,50),
		(2,'IT3080',60,60),
		(3,'MI1110',100,99),
		(4,'MI1110',100,99),
		(5,'IT3080',40,30)
-------------------------------------------------------------------------------------
GO
--INSERT DIVIDES---------------------------------------------------------------------
INSERT INTO DEVICES (DEVICE_NAME,DESCRIPTION)
VALUES	(N'Bàn 1',''),
		(N'Bàn 2',''),
		(N'Ghế 1',''),
		(N'Ghế 2',''),
		(N'Loa',''),
		(N'Máy chiếu',''),
		(N'Máy tính 1',''),
		(N'Máy tính 2',''),
		(N'Dụng cụ TN 1',''),
		(N'Dụng cụ TN 2','')
-------------------------------------------------------------------------------------
GO
--INSERT INTO DEVICES ()