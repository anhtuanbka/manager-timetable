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
	[MASTER_SUBJECT] NVARCHAR (50) UNIQUE NOT NULL,
)
CREATE TABLE [ROOMTYPES]
(
	[TYPE_ID] CHAR(20) PRIMARY KEY NOT NULL,
	[TYPE_NAME] NVARCHAR(30) UNIQUE NOT NULL,
)
CREATE TABLE [ROOMS]
(
	[ROOM_ID] CHAR(20) PRIMARY KEY NOT NULL,
	[TYPE_ID] CHAR(20) FOREIGN KEY([TYPE_ID]) REFERENCES [ROOMTYPES]([TYPE_ID]),
	[STATUS] BIT NOT NULL,/* Active or Not Active*/
)
CREATE TABLE [DEVICES]
(
	[ROOM_ID] CHAR(20) FOREIGN KEY ([ROOM_ID]) REFERENCES [ROOMS]([ROOM_ID]),
	PRIMARY KEY([ROOM_ID]),
	[COMPUTERS] INT,
	[LAMPS] INT NOT NULL,
	[TABLES] INT,
	[CHAIRS] INT,
	[CELLING_FANS] INT,
	[PROJECTORS]INT,
)
CREATE TABLE [TIME_ROOM]
(
	[TIME_ID] INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	[ROOM_ID] CHAR(20) FOREIGN KEY ([ROOM_ID]) REFERENCES [ROOMS]([ROOM_ID]),
	[DAY] CHAR (20) NOT NULL,
	[LESSION_START] INT,
	[LESSION_END] INT,
)
CREATE TABLE [TIMETABLE]
(	[TIME_ID] INT FOREIGN KEY ([TIME_ID]) REFERENCES [TIME_ROOM]([TIME_ID]),
	PRIMARY KEY ([TIME_ID]),
	[SUBJECT_ID] CHAR(20) FOREIGN KEY ([SUBJECT_ID]) REFERENCES [SUBJECTS]([SUBJECT_ID]),
	[SUBJECT_NAME] NVARCHAR(50) UNIQUE NOT NULL,
	[MAX_STUDENTS] INT NOT NULL,
	[REGISTED] INT ,
	
)
CREATE TABLE [USERS]
(
	[ID] INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	[USERNAME] NVARCHAR(50) UNIQUE,
	[PASSWORD] VARCHAR(50),
	[ENAME] NVARCHAR(50),
	[PHONE] VARCHAR(20),
	[ADDRESS] TEXT,
	[JOIN_DATE] DATETIME,
	[ADMIN] BIT,

)
