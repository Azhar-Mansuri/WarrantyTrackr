# 🛡️ WarrantyTrackr

A clean and modern web application that allows users to **add**, **view**, **filter**, and **manage warranties** for their electronic products. It automatically calculates **warranty expiry dates**, and helps identify **active**, **expired**, or **soon-to-expire** items — powered by **Spring Boot** (REST API), **MySQL** (database), and **Tailwind CSS** (frontend styling).

---

## 📸 App Screenshots


### 🌞 Light Theme

<img width="1897" height="867" alt="Screenshot 2025-07-12 112111" src="https://github.com/user-attachments/assets/d8114d64-392d-439a-aff9-ac85aacc2055" />

### 🌙 Dark Theme

<img width="1916" height="866" alt="Screenshot 2025-07-12 112201" src="https://github.com/user-attachments/assets/67e6f7a6-064c-4713-a578-abbb897d6e5e" />
<img width="1896" height="874" alt="Screenshot 2025-07-12 112259" src="https://github.com/user-attachments/assets/ddc0e985-40a9-40f2-a129-a138db07771a" />

---

## 🌍 Project Overview

**WarrantyTrackr** helps users manage their product warranties easily:

- ⏳ Add purchase date, warranty months — system auto-calculates expiry!
- 🔍 Filter by: Active | Expired | Expiring Soon
- 🌓 Toggle between Light/Dark theme
- 🧾 Delete entries with confirmation
- 📅 Expiry dates auto-calculated
- 🎨 Stylish UI with gradients and animations

---

## 🛠️ Tech Stack

- **Backend**: Java, Spring Boot, JPA, REST API
- **Frontend**: HTML, Tailwind CSS, JavaScript (Fetch API)
- **Database**: MySQL
- **Build Tool**: Maven
- **Theme**: Dark/Light Mode + Gradient + Responsive Layout

---

## 📁 File Structure

```
WarrantyTrackr/
├── src/
│   └── main/
│       ├── java/com/warranty/
│       │   ├── controller/WarrantyController.java
│       │   ├── model/ProductWarranty.java
│       │   ├── repository/WarrantyRepository.java
│       │   ├── service/WarrantyService.java
│       └── resources/
│           └── static/index.html
├── pom.xml
└── README.md
```

---

## 🔄 Application Flow

1. User enters product details via the form.
2. Submits it → frontend sends `POST` request to backend.
3. Spring Boot calculates expiry date, stores in DB.
4. On load, frontend fetches all warranties via API.
5. User can filter warranties by type (active, expired).
6. Data shown in a smooth UI with delete option.

---

## 🚀 Setup & Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/WarrantyTrackr.git
   cd WarrantyTrackr
   ```

2. **Configure MySQL database**
   - Set DB config in `application.properties`
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/warranty_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   ```

3. **Build and run**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Access frontend**
   Open your browser at:   `http://localhost:8080/index.html`

---

## 📡 Controller Endpoints

```
POST   /warranty/add              → Add warranty
GET    /warranty/all              → Get all warranties
GET    /warranty/active           → Active warranties
GET    /warranty/expired          → Expired warranties
GET    /warranty/expiring-soon    → Warranties expiring in 30 days
DELETE /warranty/{id}             → Delete by ID
```

---

## 🔮 Future Enhancements

- 📆 Notification/email before warranty expires
- 🖼️ Upload product receipt images
- 📱 Mobile PWA support
- 🔐 Add login and user accounts
- 📊 Stats dashboard (Total, active, expired, soon)

---

## 👤 Author

**Azhar Mansuri**🎓 B.Tech (IT) – Swami Vivekanand Group of Institutes, Indore🔗 [LinkedIn](https://www.linkedin.com/in/azhar-mansuri)🌱 GitHub: [@Azhar-Mansuri](https://github.com/Azhar-Mansuri)

> Leave a ⭐ on the repo if you liked it!
