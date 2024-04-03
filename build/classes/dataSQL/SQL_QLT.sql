Create database QuanLyHieuThuocTay
use QuanLyHieuThuocTay

Create table KhuyenMai
(
		maKhuyenMai		varchar(40)		PRIMARY KEY NOT NULL,
		tenKhuyenMai		nvarchar(40)		NULL,
		moTa			nvarchar(40)		NULL,
		phanTram		int		check( phanTram >=0 and phanTram <=100),
		ngayBatDau		datetime		NULL,
		ngayKetThuc		datetime		NULL,
)

Create table NhaCungCap
(
		maNhaCungCap		varchar(40)		PRIMARY KEY NOT NULL,
		tenNhaCungCap		nvarchar(40)		NULL,
		diaChi			nvarchar(100)		NULL,
		sDT			varchar(11)		NULL,
		email			nvarchar(40)		NULL,
)

Create table TaiKhoan
(
		tenTaiKhoan		varchar(40)		PRIMARY KEY NOT NULL,
		matKhau			varchar(20)		NULL,
		ngayLap			datetime		NULL,
		ghiChu			nvarchar(40)		NULL,
		vaiTro			nvarchar(40)		NULL,
)

Create table KhachHang
(
		maKhachHang 		varchar(40)		PRIMARY KEY NOT NULL,	
		tenKhachHang		nvarchar(40)		NULL,
		sDT					varchar(10) not null,	
		email				varchar(40)		NULL,
)

Create table NhanVien
(
		maNhanVien		varchar(40)		PRIMARY KEY NOT NULL,
		tenNhanVien		nvarchar(40)		NULL,
		sDT				varchar(11)		NOT NULL,
		gioiTinh		nvarchar(10)		NULL,
		email			nvarchar(40)		NULL,
		diaChi			nvarchar(40)		NULL,
		cccd			varchar(15)		NULL,
		ngayVaoLam		datetime		NULL,
		FOREIGN KEY (maNhanVien)
		REFERENCES TaiKhoan (tenTaiKhoan),
)

Create table PhieuDatThuoc
(
	 maPhieuDatThuoc	varchar(40) primary key not null,
	 ngayDat			datetime	null,
	 ghiChu				nvarchar(100) null,
	 maNhanvien			varchar(40),
	 maKhachHang		varchar(40),
	 FOREIGN KEY (maNhanvien) REFERENCES NhanVien (maNhanvien),
	 FOREIGN KEY (maKhachHang) REFERENCES KhachHang (maKhachHang),
)
Create table ToaThuoc
(
		maToa			varchar(40)		PRIMARY KEY,
		hoTenBN			nVarChar(100)		NULL,
		ngayRaToa		datetime		NULL,
		chuanDoan		nvarchar(40)		NULL,
		henKham			datetime		NULL,
)

Create table Thuoc
(
		maThuoc		varchar(40)		PRIMARY KEY NOT NULL,
		tenThuoc	nvarchar(100)				NULL,
		giaBan		money		check  (giaBan >= 0)		NOT NULL,
		soLuong		int		check (soLuong >=0),
		donVi		nvarchar(10)	NULL,
		maKhuyenMai varchar(40) FOREIGN KEY (maKhuyenMai)  REFERENCES KhuyenMai (maKhuyenMai) null,
		maNhaCungCap varchar(40) FOREIGN KEY (maNhaCungCap) REFERENCES NhaCungCap(maNhaCungCap) null,
		maToa varchar(40) FOREIGN KEY (maToa) REFERENCES ToaThuoc (maToa) null,
)


create table ChiTietToaThuoc(
	maThuoc varchar(40),
	maToa varchar (40),
	cachDung	nvarchar(100)
	PRIMARY KEY (maThuoc, maToa),
	FOREIGN KEY (maThuoc) REFERENCES Thuoc (mathuoc),
	FOREIGN KEY (maToa) REFERENCES ToaThuoc (maToa),

)

Create table HoaDon
(
		maHoaDon		varchar(40)		PRIMARY KEY NOT NULL,
		ngayLapHoaDon		datetime		NULL,
		loaiHoaDon		nvarchar(40)		NULL,
		maNhanVien		varchar(40) not null,
		makhachHang		varchar(40) not null,
		tenKhachHang		nvarchar(40)		NULL,
		FOREIGN KEY (maNhanvien) REFERENCES NhanVien (maNhanvien),
		FOREIGN KEY (maKhachHang) REFERENCES KhachHang (maKhachHang),
)

Create table PhieuNhapThuoc
(
		maPhieuNhap		varchar(40)		PRIMARY KEY NOT NULL,
		maNhanVien		varchar(40)			NOT NULL,
		ngayNhap		datetime		NULL,
		FOREIGN KEY (maNhanvien) REFERENCES NhanVien (maNhanvien),
)



Create table ChiTietPhieuNhapThuoc
(
		maPhieuNhap		varchar(40),
		maThuoc			varchar(40)	,
		tenThuoc	nvarchar(100)				NULL,
		giaNhap		money		check  (giaNhap >= 0)		NOT NULL,
		soLuong		int		check (soLuong >=0),
		doVi		nvarchar(10)	NULL,
		PRIMARY KEY (maPhieuNhap),
		FOREIGN KEY (maPhieuNhap) REFERENCES PhieuNhapThuoc (maPhieuNhap),
		FOREIGN KEY (maThuoc) REFERENCES Thuoc (maThuoc)
)

Create table ChiTietHoaDon
(
		maThuoc		varchar(40)	not null,
		mahoaDon	varchar(40) not null,
		soLuong		int check(soLuong >= 0),
		PRIMARY KEY (maThuoc, maHoaDon),
		FOREIGN KEY (mahoaDon) REFERENCES Thuoc (maThuoc),
		FOREIGN KEY (maHoaDon) REFERENCES HoaDon (maHoaDon),
)

Create table HoaDonDoiTra
(
		maHDDT			varchar(40) 		PRIMARY KEY NOT NULL,
		ngayTra			datetime		NULL,
		maHoaDon		varchar(40) null,
		FOREIGN KEY (maHoaDon) REFERENCES HoaDon (maHoaDon),
)

Create table ChiTietHoaDonDoiTra
(
		maThuoc 			varchar(40) not null,
		maHDDT				varchar(40) not null,
		soLuong				int check(soLuong >=0),
		PRIMARY KEY (maThuoc, maHDDT),
		FOREIGN KEY (maThuoc) REFERENCES Thuoc (maThuoc),
		FOREIGN KEY (maHDDT) REFERENCES HoaDonDoiTra (maHDDT),
)

Create table ChiTietPhieuDatThuoc
(
		maPhieuDatThuoc			varchar(40) not null,
		maThuoc				varchar(40) not null,
		soLuong				int check(soLuong >=0),
		PRIMARY KEY (maThuoc, maPhieuDatThuoc),
		FOREIGN KEY (maThuoc) REFERENCES Thuoc (maThuoc),
		FOREIGN KEY (maPhieuDatThuoc) REFERENCES PhieuDatThuoc (maPhieuDatThuoc),
)

insert into TaiKhoan(tenTaiKhoan,matKhau,ngayLap,ghiChu,vaiTro)
values('NV13012003','1111','2022-12-12','','NhanVien'),
	('NV20052003','1111','2022-11-03','','NhanVien'),
	('NV13012004','1111','2022-12-13','','QuanLy'),
	('NV23072004','1111','2022-11-03','','QuanLy'),
	('NV11022005','1111','2022-11-03','','NhanVien')

insert into KhachHang(maKhachHang, tenKhachHang, sDT, email)
values ('KH001', 'Nguyễn Văn A', '0987654321', 'nguyenvana@example.com'),
('KH002', 'Trần Thị B', '0912345678', 'tranthib@example.com'),
('KH003', 'Lê Văn C', '0901234567', 'levanc@example.com'),
('KH004', 'Phạm Thị D', '0976543210', 'phamthid@example.com'),
('KH005', 'Hoàng Văn E', '0965432109', 'hoangvane@example.com'),
('KH006', 'Nguyễn Thị F', '0912345678', 'nguyenthif@example.com'),
('KH007', 'Trần Văn G', '0987654321', 'tranvang@example.com'),
('KH008', 'Lê Thị H', '0909876543', 'lethih@example.com'),
('KH009', 'Phạm Văn I', '0987654321', 'phamvani@example.com'),
('KH010', 'Hoàng Thị K', '0976543210', 'hoangthik@example.com'),
('KH011', 'Nguyễn Văn L', '0912345678', 'nguyenvanl@example.com'),
('KH012', 'Trần Thị M', '0901234567', 'tranthim@example.com'),
('KH013', 'Lê Văn N', '0987654321', 'levann@example.com'),
('KH014', 'Phạm Thị O', '0912345678', 'phamthio@example.com'),
('KH015', 'Hoàng Văn P', '0976543210', 'hoangvanp@example.com'),
('KH016', 'Nguyễn Thị Q', '0965432109', 'nguyenthiq@example.com'),
('KH017', 'Trần Văn R', '0909876543', 'tranvanr@example.com'),
('KH018', 'Lê Thị S', '0987654321', 'lethis@example.com'),
('KH019', 'Phạm Văn T', '0976543210', 'phamvant@example.com'),
('KH020', 'Hoàng Thị U', '0912345678', 'hoangthiu@example.com'),
('KH021', 'Nguyễn Văn V', '0901234567', 'nguyenvanv@example.com'),
('KH022', 'Trần Thị W', '0987654321', 'tranthiw@example.com'),
('KH023', 'Lê Văn X', '0912345678', 'levanx@example.com'),
('KH024', 'Phạm Thị Y', '0976543210', 'phamthiy@example.com'),
('KH025', 'Hoàng Văn Z', '0987654321', 'hoangvanz@example.com'),
('KH026', 'Nguyễn Thị AA', '0909876543', 'nguyenthiaa@example.com'),
('KH027', 'Trần Văn BB', '0987654321', 'tranvanbb@example.com'),
('KH028', 'Lê Thị CC', '0912345678', 'lethicc@example.com'),
('KH029', 'Phạm Văn DD', '0976543210', 'phamvandd@example.com'),
('KH030', 'Hoàng Thị EE', '0901234567', 'hoangthiee@example.com'),
('KH031', 'Nguyễn Văn FF', '0987654321', 'nguyenvanff@example.com'),
('KH032', 'Trần Thị GG', '0912345678', 'tranthigg@example.com'),
('KH033', 'Lê Văn HH', '0976543210', 'levanhh@example.com'),
('KH034', 'Phạm Thị II', '0987654321', 'phamthiii@example.com'),
('KH035', 'Hoàng Văn JJ', '0912345678', 'hoangvanjj@example.com'),
('KH036', 'Nguyễn Thị KK', '0976543210', 'nguyenthikk@example.com'),
('KH037', 'Trần Văn LL', '0987654321', 'tranvanll@example.com'),
('KH038', 'Lê Thị MM', '0912345678', 'lethimm@example.com'),
('KH039', 'Phạm Văn NN', '0976543210', 'phamvannn@example.com'),
('KH040', 'Hoàng Thị OO', '0987654321', 'hoangthioo@example.com'),
('KH041', 'Nguyễn Văn PP', '0901234567', 'nguyenvanpp@example.com'),
('KH042', 'Trần Thị QQ', '0987654321', 'tranthiqq@example.com'),
('KH043', 'Lê Văn RR', '0912345678', 'levanrr@example.com'),
('KH044', 'Phạm Thị SS', '0976543210', 'phamthiss@example.com'),
('KH045', 'Hoàng Văn TT', '0987654321', 'hoangvantt@example.com'),
('KH046', 'Nguyễn Thị UU', '0912345678', 'nguyenthiuu@example.com'),
('KH047', 'Trần Văn VV', '0976543210', 'tranvanvv@example.com'),
('KH048', 'Lê Thị WW', '0987654321', 'lethiww@example.com'),
('KH049', 'Phạm Văn XX', '0901234567', 'phamvanxx@example.com'),
('KH050', 'Hoàng Thị YY', '0987654321', 'hoangthiyy@example.com')
insert into NhanVien(maNhanVien, tenNhanVien, sDT, gioiTinh,email,diaChi,cccd,ngayVaoLam)
values	('NV13012003','Nguyen Chieu Van','0923465177','Nu','ngyuyeh19@gmail.com','Go Vap','876378294746','2022-12-12'),
('NV20052003','Nguyen Chieu Tai','0923465177','Nu','ngyuyeh19@gmail.com','Go Vap','876378294746','2022-11-03'),
('NV13012004','Nguyen Chieu Toi','0923465177','Nu','ngyuyeh19@gmail.com','Go Vap','876378294746','2022-12-13'),
('NV23072004','Nguyen Nam','0923433177','Nu','ngyuyeh19@gmail.com','Go Vap','876378294746','2022-11-03'),
('NV11022005','Nguyen Hau','0923464177','Nu','ngyuyeh19@gmail.com','Go Vap','876378294746','2022-11-03')

insert into NhaCungCap(maNhaCungCap,tenNhaCungCap,diaChi,sDT,email)
values ('NCC001','PGA','HCM','0923433177','pga@gmail.com'),
('NCC002','PGA','HCM','0923433177','pga@gmail.com'),
('NCC003','PGB','HCM','0923433177','pgb@gmail.com'),
('NCC004','PGC','HCM','0923433177','pgc@gmail.com'),
('NCC005','PGD','HCM','0923433177','pgd@gmail.com'),
('NCC006','PGE','HCM','0923433177','pge@gmail.com'),
('NCC007','PGF','HCM','0923433177','pgf@gmail.com'),
('NCC008','PGG','HCM','0923433177','pgg@gmail.com'),
('NCC009','PGH','HCM','0923433177','pgh@gmail.com'),
('NCC0010','PGY','HCM','0923433177','pgy@gmail.com'),
('NCC0011','PGO','HCM','0923433177','pgo@gmail.com'),
('NCC0012','PGW','HCM','0923433177','pgw@gmail.com'),
('NCC0013','PGS','HCM','0923433177','pgs@gmail.com'),
('NCC0014','PGL','HCM','0923433177','pgl@gmail.com'),
('NCC0015','PGK','HCM','0923433177','pgk@gmail.com'),
('NCC001','PGX','HCM','0923433177','pgx@gmail.com')

insert into KhuyenMai(maKhuyenMai,tenKhuyenMai,moTa,phanTram,ngayBatDau,ngayKetThuc)
values ('KM001', 'Khuyến mãi mua 1 tặng 1', 'Mua một loại thuốc, tặng kèm một loại thuốc khác cùng loại hoặc loại tương đương.', NULL, '2024-04-01', '2024-04-30'),
('KM002', 'Giảm giá theo số lượng', 'Giảm giá cho khách hàng khi mua số lượng lớn thuốc.', 15, '2024-05-01', '2024-05-31'),
('KM003', 'Ưu đãi cho thành viên', 'Cung cấp ưu đãi đặc biệt cho các thành viên đã đăng ký.', 10, '2024-06-01', '2024-06-30'),
('KM004', 'Quà tặng kèm', 'Tặng kèm quà tặng như hộp đựng thuốc, dụng cụ y tế khi mua các loại thuốc nhất định.', NULL, '2024-07-01', '2024-07-31'),
('KM005', 'Giảm giá dịp lễ', 'Cung cấp ưu đãi vào dịp lễ như Tết Nguyên Đán, Giáng Sinh.', 20, '2024-12-20', '2024-12-31')


insert into Thuoc(maThuoc,tenThuoc,giaBan,soLuong,donVi,makhuyenMai,maNhaCungCap,maToa)
values ('T001', 'Paracetamol', 15000, 1000, 'Viên', 'KM001', 'NCC001', NULL),
('T002', 'Ibuprofen', 20000, 800, 'Viên', 'KM002', 'NCC002', NULL),
('T003', 'Aspirin', 12000, 1200, 'Viên', 'KM003', 'NCC003', NULL),
('T004', 'Amoxicillin', 25000, 500, 'Viên', NULL, 'NCC004', NULL),
('T005', 'Cetirizine', 18000, 700, 'Viên', 'KM004', 'NCC005', NULL),
('T006', 'Diazepam', 30000, 400, 'Viên', 'KM005', 'NCC006', NULL),
('T007', 'Omeprazole', 22000, 600, 'Viên', NULL, 'NCC007', NULL),
('T008', 'Loratadine', 21000, 900, 'Viên', NULL, 'NCC008', NULL),
('T009', 'Tramadol', 35000, 300, 'Viên', 'KM001', 'NCC009', NULL),
('T010', 'Prednisone', 28000, 400, 'Viên', NULL, 'NCC010', NULL),
('T011', 'Metformin', 18000, 600, 'Viên', 'KM002', 'NCC001', NULL),
('T012', 'Atorvastatin', 30000, 500, 'Viên', 'KM003', 'NCC002', NULL),
('T013', 'Doxycycline', 22000, 700, 'Viên', 'KM004', 'NCC003', NULL),
('T014', 'Simvastatin', 28000, 800, 'Viên', 'KM005', 'NCC004', NULL),
('T015', 'Cephalexin', 25000, 900, 'Viên', NULL, 'NCC005', NULL),
('T016', 'Hydrochlorothiazide', 20000, 800, 'Viên', NULL, 'NCC006', NULL),
('T017', 'Alprazolam', 35000, 600, 'Viên', 'KM001', 'NCC007', NULL),
('T018', 'Bisoprolol', 28000, 500, 'Viên', NULL, 'NCC008', NULL),
('T019', 'Gabapentin', 30000, 400, 'Viên', NULL, 'NCC009', NULL),
('T020', 'Escitalopram', 28000, 700, 'Viên', 'KM002', 'NCC010', NULL),
('T021', 'Metoprolol', 25000, 800, 'Viên', 'KM003', 'NCC001', NULL),
('T022', 'Levothyroxine', 20000, 900, 'Viên', 'KM004', 'NCC002', NULL),
('T023', 'Fluoxetine', 18000, 600, 'Viên', 'KM005', 'NCC003', NULL),
('T024', 'Warfarin', 22000, 700, 'Viên', NULL, 'NCC004', NULL),
('T025', 'Ondansetron', 30000, 800, 'Viên', NULL, 'NCC005', NULL),
('T026', 'Duloxetine', 35000, 500, 'Viên', 'KM001', 'NCC006', NULL),
('T027', 'Pantoprazole', 25000, 400, 'Viên', NULL, 'NCC007', NULL),
('T028', 'Pravastatin', 28000, 300, 'Viên', NULL, 'NCC008', NULL),
('T029', 'Furosemide', 22000, 900, 'Viên', 'KM002', 'NCC009', NULL),
('T030', 'Methotrexate', 32000, 800, 'Viên', 'KM003', 'NCC010', NULL),
('T031', 'Sertraline', 30000, 700, 'Viên', 'KM004', 'NCC001', NULL),
('T032', 'Citalopram', 25000, 600, 'Viên', 'KM005', 'NCC002', NULL),
('T033', 'Lisinopril', 28000, 500, 'Viên', NULL, 'NCC003', NULL),
('T034', 'Amlodipine', 22000, 400, 'Viên', NULL, 'NCC004', NULL),
('T035', 'Levofloxacin', 35000, 300, 'Viên', 'KM001', 'NCC005', NULL),
('T036', 'Losartan', 30000, 600, 'Viên', NULL, 'NCC006', NULL),
('T037', 'Clonazepam', 28000, 700, 'Viên', NULL, 'NCC007', NULL),
('T038', 'Carvedilol', 25000, 800, 'Viên', 'KM002', 'NCC008', NULL),
('T039', 'Ranitidine', 20000, 900, 'Viên', 'KM003', 'NCC009', NULL),
('T040', 'Methylprednisolone', 18000, 800, 'Viên', 'KM004', 'NCC010', NULL),
('T041', 'Diclofenac', 22000, 700, 'Viên', 'KM005', 'NCC001', NULL),
('T042', 'Bupropion', 30000, 600, 'Viên', NULL, 'NCC002', NULL),
('T043', 'Naproxen', 28000, 500, 'Viên', NULL, 'NCC003', NULL),
('T044', 'Trazodone', 25000, 400, 'Viên', 'KM001', 'NCC004', NULL),
('T045', 'Metronidazole', 22000, 300, 'Viên', NULL, 'NCC005', NULL),
('T046', 'Tamsulosin', 32000, 700, 'Viên', 'KM002', 'NCC006', NULL),
('T047', 'Fluconazole', 30000, 800, 'Viên', NULL, 'NCC007', NULL),
('T048', 'Ciprofloxacin', 28000, 900, 'Viên', NULL, 'NCC008', NULL),
('T049', 'Cefuroxime', 25000, 500, 'Viên', 'KM003', 'NCC009', NULL),
('T050', 'Fexofenadine', 18000, 400, 'Viên', 'KM004', 'NCC010', NULL)