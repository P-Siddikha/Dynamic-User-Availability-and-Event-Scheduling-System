# Dynamic-User-Availability-and-Event-Scheduling-System

To create a full-stack application in Java that fulfills the requirements for a Dynamic User Availability and Event Scheduling System, you'll need to integrate various technologies and frameworks. Below is a high-level overview and some code snippets to guide you through developing the system.

1. Project Setup
You'll use the following technologies:

Frontend: React.js with TypeScript
Backend: Spring Boot (Java)
Database: MongoDB
Build Tool: Maven
2. Backend Implementation with Spring Boot
2.1. Setting Up the Spring Boot Application
Start by setting up your Spring Boot application. Create a new Spring Boot project using Spring Initializr or in your IDE.

Include dependencies for:

Spring Web
Spring Data MongoDB
Spring Security (for user authentication)
Lombok (optional, for reducing boilerplate code)
Setup Instructions
Frontend
Clone the Repository:

git clone https://github.com/your-username/your-repo.git
cd your-repo/frontend
Install Dependencies:

npm install
Build the Application:

npm run build
Start the Development Server:

npm run dev
The frontend will be available at http://localhost:3000.

Backend
Navigate to the Backend Directory:

cd your-repo/backend
Install Dependencies:

npm install
Set Up Environment Variables:

Create a .env file in the backend directory with the following content:

MONGO_URI=your_mongodb_connection_string
PORT=5000
Start the Development Server:

npm run dev
The backend will be available at http://localhost:5000.

Deployment Instructions
Deploy Backend to Render
Create a Render Account:

Sign up at Render.

Create a New Web Service:

Go to the Render dashboard.
Click on "New" and select "Web Service."
Connect your GitHub repository containing the backend code.
Configure the build command as npm install and the start command as npm run start.
Add environment variables such as MONGO_URI.
Click "Create Web Service."
Deploy Frontend to Netlify
Create a Netlify Account:

Sign up at Netlify.

Connect Your GitHub Repository:

Go to the Netlify dashboard.
Click on "New site from Git."
Choose GitHub and authorize Netlify to access your repositories.
Select the repository containing the frontend code.
Configure Build Settings:

Set the build command to npm run build.
Set the publish directory to dist (or build).
Deploy the Site:

Click on "Deploy site."

MongoDB Compass
Download and Install MongoDB Compass:

Get it from MongoDB Compass Downloads.

Connect to MongoDB:

Open MongoDB Compass.
Click on "New Connection."
Enter your MongoDB connection string.
Click "Connect."
Usage
For Users
Log In: Enter your email on the home page to log in.
Set Availability: Use the form to set your availability for different days and time slots.
For Admins
View Availability: Navigate to the Admin Dashboard to select a user and view their availability.
Schedule Sessions: Choose available slots to schedule one-on-one or multi-participant sessions.
Contributing
Feel free to submit issues or pull requests on GitHub.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgements
React: A JavaScript library for building user interfaces.
Express: A web application framework for Node.js.
MongoDB: A NoSQL database used for data storage.
Netlify: A platform for deploying static sites.
Render: A platform for deploying backend applications.
