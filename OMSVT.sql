USE [master]
GO
/****** Object:  Database [OMS2]    Script Date: 12/3/2019 10:30:56 PM ******/
CREATE DATABASE [OMS2]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'OMS2', FILENAME = N'E:\SQL Server 2014\MSSQL12.MSSQLSERVER\MSSQL\DATA\OMS2.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'OMS2_log', FILENAME = N'E:\SQL Server 2014\MSSQL12.MSSQLSERVER\MSSQL\DATA\OMS2_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [OMS2] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [OMS2].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [OMS2] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [OMS2] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [OMS2] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [OMS2] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [OMS2] SET ARITHABORT OFF 
GO
ALTER DATABASE [OMS2] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [OMS2] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [OMS2] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [OMS2] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [OMS2] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [OMS2] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [OMS2] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [OMS2] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [OMS2] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [OMS2] SET  DISABLE_BROKER 
GO
ALTER DATABASE [OMS2] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [OMS2] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [OMS2] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [OMS2] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [OMS2] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [OMS2] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [OMS2] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [OMS2] SET RECOVERY FULL 
GO
ALTER DATABASE [OMS2] SET  MULTI_USER 
GO
ALTER DATABASE [OMS2] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [OMS2] SET DB_CHAINING OFF 
GO
ALTER DATABASE [OMS2] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [OMS2] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [OMS2] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'OMS2', N'ON'
GO
USE [OMS2]
GO
/****** Object:  Table [dbo].[Admin]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Admin](
	[Admin_ID] [varchar](50) NOT NULL,
	[Password] [varchar](50) NOT NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[AOD]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[AOD](
	[AOD_No] [int] NOT NULL,
	[Vehicle_No] [varchar](15) NOT NULL,
	[AOD_Date] [date] NOT NULL,
	[AOD_Description] [varchar](50) NOT NULL,
	[AOD_Quantity] [int] NOT NULL,
	[Invoice_No] [int] NOT NULL,
 CONSTRAINT [PK_AOD] PRIMARY KEY CLUSTERED 
(
	[AOD_No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Attendance]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Attendance](
	[Employee_ID] [int] NOT NULL,
	[AttendedDate] [date] NOT NULL,
	[WorkedHours] [int] NOT NULL,
 CONSTRAINT [PK_Attendance] PRIMARY KEY CLUSTERED 
(
	[Employee_ID] ASC,
	[AttendedDate] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Client]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Client](
	[Client_ID] [int] NOT NULL,
	[Client_Name] [varchar](50) NOT NULL,
	[Client_Adresss] [nchar](10) NOT NULL,
	[Client_contactNo] [nchar](10) NOT NULL,
	[Client_VAT] [int] NOT NULL,
	[Client_SVAT] [int] NOT NULL,
 CONSTRAINT [PK_Client] PRIMARY KEY CLUSTERED 
(
	[Client_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Company]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Company](
	[Reg_No] [int] NULL,
	[Com_VAT_NO] [int] NULL,
	[Com_NBT_NO] [int] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Company_Details]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Company_Details](
	[CompanyDetailID] [int] NOT NULL,
	[Contact_Name] [varchar](50) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[Phone_No] [int] NOT NULL,
	[Fax_No] [int] NOT NULL,
	[Address] [varchar](50) NOT NULL,
	[Reg_No] [int] NOT NULL,
	[Com_Vat_No] [int] NOT NULL,
	[Com_NBT_No] [int] NOT NULL,
	[DateTimeLastModified] [datetime] NOT NULL,
 CONSTRAINT [PK_Company_Details] PRIMARY KEY CLUSTERED 
(
	[CompanyDetailID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Driver]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Driver](
	[Vehicle_ID] [varchar](15) NULL,
	[Driver_Name] [varchar](50) NULL,
	[Driver_Cont] [int] NULL,
	[Driver_address] [nchar](50) NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Employee](
	[Employee_ID] [int] NOT NULL,
	[Employee_Name] [varchar](50) NULL,
	[Employee_Role] [char](10) NULL,
	[Employee_Contact] [int] NULL,
	[Salary_Rate] [nchar](10) NULL,
	[Employee_Email] [varchar](50) NULL,
 CONSTRAINT [PK_Employee] PRIMARY KEY CLUSTERED 
(
	[Employee_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Income]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Income](
	[Cost] [float] NULL,
	[Sales] [float] NULL,
	[Income] [float] NULL,
	[Profit] [float] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Invoice_Detail]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Invoice_Detail](
	[Invoice_No] [int] NOT NULL,
	[Item_ID] [int] NOT NULL,
	[Quantity] [int] NULL,
	[Price] [float] NULL,
 CONSTRAINT [PK_Invoice_Detail] PRIMARY KEY CLUSTERED 
(
	[Invoice_No] ASC,
	[Item_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[InvoiceHeader]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[InvoiceHeader](
	[Invoice_No] [int] NOT NULL,
	[Order_No] [int] NULL,
	[Invoice_Description] [varchar](50) NULL,
	[Invoice_Date] [date] NOT NULL,
	[Invoice_TotaAmountBeforeTax] [float] NOT NULL,
	[Invoice_TotalAmountAfterTax] [float] NOT NULL,
	[TaxRateId] [int] NOT NULL,
	[CompanyDetailID] [int] NOT NULL,
	[Client_ID] [int] NOT NULL,
	[Client_Name] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Invoice] PRIMARY KEY CLUSTERED 
(
	[Invoice_No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Item]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Item](
	[Item_ID] [int] NOT NULL,
	[Item_Name] [varchar](20) NOT NULL,
	[Unit_Price] [float] NOT NULL,
	[UnitMeasure] [nvarchar](10) NULL,
 CONSTRAINT [PK_Item] PRIMARY KEY CLUSTERED 
(
	[Item_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Material]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Material](
	[Material_ID] [int] NOT NULL,
	[Material_Description] [varchar](50) NOT NULL,
	[Material_Quantity] [int] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Order]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Order](
	[Order_No] [int] NOT NULL,
	[Order_Item] [varchar](50) NULL,
	[Order_Date] [date] NOT NULL,
	[Total_Order_Amount] [float] NOT NULL,
	[OrderStatus_ID] [int] NOT NULL,
	[Client_ID] [int] NOT NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[Order_No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Order_Detail]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order_Detail](
	[Order_No] [int] NOT NULL,
	[Item_ID] [int] NOT NULL,
	[Quantity] [int] NULL,
 CONSTRAINT [PK_Order_Detail] PRIMARY KEY CLUSTERED 
(
	[Order_No] ASC,
	[Item_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Order_Status]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order_Status](
	[OredrStatus_ID] [int] NOT NULL,
	[Order_No] [int] NULL,
	[OredrStatus] [nvarchar](50) NULL,
 CONSTRAINT [PK_Order_Status] PRIMARY KEY CLUSTERED 
(
	[OredrStatus_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Reorder_Level]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Reorder_Level](
	[Item_ID] [int] NOT NULL,
	[Reorder_Level] [int] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Returnable]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Returnable](
	[Return_Description] [varchar](50) NULL,
	[Return_Date] [date] NULL,
	[Return_Address] [varchar](50) NULL,
	[Return_Quantity] [int] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Salary]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Salary](
	[Employee_ID] [int] NOT NULL,
	[Salary_Month] [varchar](50) NOT NULL,
	[Salary_Week] [int] NOT NULL,
	[Salary] [int] NOT NULL,
	[EPF] [float] NOT NULL,
	[ETF] [float] NOT NULL,
	[TotalBonus] [float] NULL,
	[TotalDeductions] [float] NULL,
	[Total_Salary] [float] NULL,
 CONSTRAINT [PK_Salary] PRIMARY KEY CLUSTERED 
(
	[Employee_ID] ASC,
	[Salary_Month] ASC,
	[Salary_Week] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Spare_Parts]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Spare_Parts](
	[S_ID] [int] NOT NULL,
	[S_Name] [varchar](50) NULL,
	[S_Quantity] [int] NOT NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Supplier]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Supplier](
	[Supplier_ID] [int] NOT NULL,
	[Supplier_Name] [varchar](25) NOT NULL,
	[Supplier_Address] [varchar](50) NOT NULL,
	[Supplier_PhoNo] [int] NULL,
	[Supplier_Email] [varchar](30) NULL,
 CONSTRAINT [PK_Supplier] PRIMARY KEY CLUSTERED 
(
	[Supplier_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Supply]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Supply](
	[Supply_No] [int] NOT NULL,
	[Supplier_ID] [int] NULL,
	[Supply_Item] [varchar](30) NULL,
	[Supply_Credit] [float] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TaxRate]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaxRate](
	[TaxRateID] [int] NOT NULL,
	[VAT] [int] NOT NULL,
	[NBT] [int] NOT NULL,
	[DateTimeLastUpdated] [datetime] NOT NULL,
 CONSTRAINT [PK_Tax] PRIMARY KEY CLUSTERED 
(
	[TaxRateID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Tool]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tool](
	[Tool_ID] [int] NOT NULL,
	[Tool_Name] [varchar](50) NULL,
	[Tool_Quantity] [int] NULL
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Vehicle]    Script Date: 12/3/2019 10:30:57 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Vehicle](
	[Vehicle_ID] [int] NOT NULL,
	[Vehicle_No] [varchar](15) NOT NULL,
	[Driver_ID] [varchar](15) NOT NULL,
	[Expenses] [money] NULL,
 CONSTRAINT [PK_Vehicle] PRIMARY KEY CLUSTERED 
(
	[Vehicle_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Index [FK_AOD]    Script Date: 12/3/2019 10:30:57 PM ******/
CREATE NONCLUSTERED INDEX [FK_AOD] ON [dbo].[AOD]
(
	[Invoice_No] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Company_Details] ADD  CONSTRAINT [DF_Company_Details_DateTimeLastModified]  DEFAULT (getdate()) FOR [DateTimeLastModified]
GO
ALTER TABLE [dbo].[TaxRate] ADD  CONSTRAINT [DF_Tax_RecordLastUpdated]  DEFAULT (getdate()) FOR [DateTimeLastUpdated]
GO
ALTER TABLE [dbo].[Attendance]  WITH CHECK ADD  CONSTRAINT [FK_Attendance_Employee] FOREIGN KEY([Employee_ID])
REFERENCES [dbo].[Employee] ([Employee_ID])
GO
ALTER TABLE [dbo].[Attendance] CHECK CONSTRAINT [FK_Attendance_Employee]
GO
ALTER TABLE [dbo].[Invoice_Detail]  WITH CHECK ADD  CONSTRAINT [FK_Invoice_Detail_InvoiceHeader] FOREIGN KEY([Invoice_No])
REFERENCES [dbo].[InvoiceHeader] ([Invoice_No])
GO
ALTER TABLE [dbo].[Invoice_Detail] CHECK CONSTRAINT [FK_Invoice_Detail_InvoiceHeader]
GO
ALTER TABLE [dbo].[InvoiceHeader]  WITH CHECK ADD  CONSTRAINT [FK_InvoiceHeader_Company_Details] FOREIGN KEY([CompanyDetailID])
REFERENCES [dbo].[Company_Details] ([CompanyDetailID])
GO
ALTER TABLE [dbo].[InvoiceHeader] CHECK CONSTRAINT [FK_InvoiceHeader_Company_Details]
GO
ALTER TABLE [dbo].[InvoiceHeader]  WITH CHECK ADD  CONSTRAINT [FK_InvoiceHeader_Order] FOREIGN KEY([Order_No])
REFERENCES [dbo].[Order] ([Order_No])
GO
ALTER TABLE [dbo].[InvoiceHeader] CHECK CONSTRAINT [FK_InvoiceHeader_Order]
GO
ALTER TABLE [dbo].[InvoiceHeader]  WITH CHECK ADD  CONSTRAINT [FK_InvoiceHeader_Tax] FOREIGN KEY([TaxRateId])
REFERENCES [dbo].[TaxRate] ([TaxRateID])
GO
ALTER TABLE [dbo].[InvoiceHeader] CHECK CONSTRAINT [FK_InvoiceHeader_Tax]
GO
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Client] FOREIGN KEY([Client_ID])
REFERENCES [dbo].[Client] ([Client_ID])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Client]
GO
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Order_Status] FOREIGN KEY([OrderStatus_ID])
REFERENCES [dbo].[Order_Status] ([OredrStatus_ID])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Order_Status]
GO
ALTER TABLE [dbo].[Order_Detail]  WITH CHECK ADD  CONSTRAINT [FK_Order_Detail_Item] FOREIGN KEY([Item_ID])
REFERENCES [dbo].[Item] ([Item_ID])
GO
ALTER TABLE [dbo].[Order_Detail] CHECK CONSTRAINT [FK_Order_Detail_Item]
GO
ALTER TABLE [dbo].[Order_Detail]  WITH CHECK ADD  CONSTRAINT [FK_Order_Detail_Order] FOREIGN KEY([Order_No])
REFERENCES [dbo].[Order] ([Order_No])
GO
ALTER TABLE [dbo].[Order_Detail] CHECK CONSTRAINT [FK_Order_Detail_Order]
GO
ALTER TABLE [dbo].[Salary]  WITH CHECK ADD  CONSTRAINT [FK_Salary_Employee] FOREIGN KEY([Employee_ID])
REFERENCES [dbo].[Employee] ([Employee_ID])
GO
ALTER TABLE [dbo].[Salary] CHECK CONSTRAINT [FK_Salary_Employee]
GO
USE [master]
GO
ALTER DATABASE [OMS2] SET  READ_WRITE 
GO
