

---

# Dynamic User Availability and Event Scheduling System

To create a full-stack application in Java that fulfills the requirements for a Dynamic User Availability and Event Scheduling System, you'll need to integrate various technologies and frameworks. Below is a high-level overview and some code snippets to guide you through developing the system.

### 1. Project Setup
You'll use the following technologies:

- *Frontend*: React.js with TypeScript
- *Backend*: Spring Boot (Java)
- *Database*: MongoDB
- *Build Tool*: Maven

### 2. Backend Implementation with Spring Boot

#### 2.1. Setting Up the Spring Boot Application

Start by setting up your Spring Boot application. Create a new Spring Boot project using Spring Initializr or in your IDE.

Include dependencies for:
- Spring Web
- Spring Data MongoDB
- Spring Security (for user authentication)
- Lombok (optional, for reducing boilerplate code)


## Setup Instructions

### Frontend

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/your-username/your-repo.git
   cd your-repo/frontend
   ```

2. **Install Dependencies:**

   ```bash
   npm install
   ```

3. **Build the Application:**

   ```bash
   npm run build
   ```

4. **Start the Development Server:**

   ```bash
   npm run dev
   ```

   The frontend will be available at `http://localhost:3000`.

### Backend

1. **Navigate to the Backend Directory:**

   ```bash
   cd your-repo/backend
   ```

2. **Install Dependencies:**

   ```bash
   npm install
   ```

3. **Set Up Environment Variables:**

   Create a `.env` file in the `backend` directory with the following content:

   ```plaintext
   MONGO_URI=your_mongodb_connection_string
   PORT=5000
   ```

4. **Start the Development Server:**

   ```bash
   npm run dev
   ```

   The backend will be available at `http://localhost:5000`.

## Deployment Instructions

### Deploy Backend to Render

1. **Create a Render Account:**

   Sign up at [Render](https://render.com/).

2. **Create a New Web Service:**

   - Go to the [Render dashboard](https://dashboard.render.com/).
   - Click on "New" and select "Web Service."
   - Connect your GitHub repository containing the backend code.
   - Configure the build command as `npm install` and the start command as `npm run start`.
   - Add environment variables such as `MONGO_URI`.
   - Click "Create Web Service."

### Deploy Frontend to Netlify

1. **Create a Netlify Account:**

   Sign up at [Netlify](https://www.netlify.com/).

2. **Connect Your GitHub Repository:**

   - Go to the [Netlify dashboard](https://app.netlify.com/).
   - Click on "New site from Git."
   - Choose GitHub and authorize Netlify to access your repositories.
   - Select the repository containing the frontend code.

3. **Configure Build Settings:**

   - Set the build command to `npm run build`.
   - Set the publish directory to `dist` (or `build`).

4. **Deploy the Site:**

   Click on "Deploy site."

## MongoDB Compass

1. **Download and Install MongoDB Compass:**

   Get it from [MongoDB Compass Downloads](https://www.mongodb.com/products/compass).

2. **Connect to MongoDB:**

   - Open MongoDB Compass.
   - Click on "New Connection."
   - Enter your MongoDB connection string.
   - Click "Connect."

## Usage

### For Users

- **Log In:** Enter your email on the home page to log in.
- **Set Availability:** Use the form to set your availability for different days and time slots.

### For Admins

- **View Availability:** Navigate to the Admin Dashboard to select a user and view their availability.
- **Schedule Sessions:** Choose available slots to schedule one-on-one or multi-participant sessions.

## Contributing

Feel free to submit issues or pull requests on [GitHub](https://github.com/your-username/your-repo).

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- **React:** A JavaScript library for building user interfaces.
- **Express:** A web application framework for Node.js.
- **MongoDB:** A NoSQL database used for data storage.
- **Netlify:** A platform for deploying static sites.
- **Render:** A platform for deploying backend applications.

---
