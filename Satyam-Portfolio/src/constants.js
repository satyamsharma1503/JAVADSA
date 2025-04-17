// Skills Section Logo's
import htmlLogo from "./assets/tech_logo/html.png";
import cssLogo from "./assets/tech_logo/css.png";
import sassLogo from "./assets/tech_logo/sass.png";
import javascriptLogo from "./assets/tech_logo/javascript.png";
import reactjsLogo from "./assets/tech_logo/reactjs.png";
// import angularLogo from './assets/tech_logo/angular.png';
import reduxLogo from "./assets/tech_logo/redux.png";
import nextjsLogo from "./assets/tech_logo/nextjs.png";
import tailwindcssLogo from "./assets/tech_logo/tailwindcss.png";
import gsapLogo from "./assets/tech_logo/gsap.png";
import materialuiLogo from "./assets/tech_logo/materialui.png";
import bootstrapLogo from "./assets/tech_logo/bootstrap.png";
import springbootLogo from "./assets/tech_logo/springboot.png";
import nodejsLogo from "./assets/tech_logo/nodejs.png";
import expressjsLogo from "./assets/tech_logo/express.png";
import mysqlLogo from "./assets/tech_logo/mysql.png";
import mongodbLogo from "./assets/tech_logo/mongodb.png";
import firebaseLogo from "./assets/tech_logo/firebase.png";
import cLogo from "./assets/tech_logo/c.png";
import cppLogo from "./assets/tech_logo/cpp.png";
import javaLogo from "./assets/tech_logo/java.png";
import pythonLogo from "./assets/tech_logo/python.png";
import typescriptLogo from "./assets/tech_logo/typescript.png";
import gitLogo from "./assets/tech_logo/git.png";
import githubLogo from "./assets/tech_logo/github.png";
import vscodeLogo from "./assets/tech_logo/vscode.png";
import postmanLogo from "./assets/tech_logo/postman.png";
import mcLogo from "./assets/tech_logo/mc.png";
import figmaLogo from "./assets/tech_logo/figma.png";
import netlifyLogo from "./assets/tech_logo/netlify.png";
import vercelLogo from "./assets/tech_logo/vercel.png";
import postgreLogo from "./assets/tech_logo/postgre.png";
import csharpLogo from "./assets/tech_logo/csharp.png";

// Experience Section Logo's
import webverseLogo from "./assets/company_logo/webverse_logo.png";
import agcLogo from "./assets/company_logo/agc_logo.png";
import newtonschoolLogo from "./assets/company_logo/newtonschool_logo.png";

// Education Section Logo's
import AKTU from "./assets/education_logo/AKTU.png";
import CBSE from "./assets/education_logo/CBSE.png";

// Project Section Logo's
import githubdetLogo from "./assets/work_logo/github_det.png";
import Netflix from "./assets/work_logo/Netflix.png";
import movierecLogo from "./assets/work_logo/movie_rec.png";
import GUIHotel from "./assets/work_logo/GUIHotel.png";
import Calculator from "./assets/work_logo/Calculator.png";
import Railway from "./assets/work_logo/Railway.png";
import JobPortal from "./assets/work_logo/JobPortal.png";
import imagesearchLogo from "./assets/work_logo/image_search.png";
// import removebgLogo from "./assets/work_logo/remove_bg.png";

export const SkillsInfo = [
  {
    title: "Frontend",
    skills: [
      { name: "HTML", logo: htmlLogo },
      { name: "CSS", logo: cssLogo },
      { name: "JavaScript", logo: javascriptLogo },
      { name: "React JS", logo: reactjsLogo },
      { name: "Next JS", logo: nextjsLogo },
      { name: "Tailwind CSS", logo: tailwindcssLogo },
      { name: "Bootstrap", logo: bootstrapLogo },
    ],
  },
  {
    title: "Backend",
    skills: [
      { name: "Springboot", logo: springbootLogo },
      { name: "Node JS", logo: nodejsLogo },
      { name: "Express JS", logo: expressjsLogo },
      { name: "MySQL", logo: mysqlLogo },
      { name: "MongoDB", logo: mongodbLogo },
    ],
  },
  {
    title: "Languages",
    skills: [
      { name: "C", logo: cLogo },
      { name: "Java", logo: javaLogo },
      { name: "Python", logo: pythonLogo },
      { name: "JavaScript", logo: javascriptLogo },
    ],
  },
  {
    title: "Tools",
    skills: [
      { name: "Git", logo: gitLogo },
      { name: "GitHub", logo: githubLogo },
      { name: "VS Code", logo: vscodeLogo },
      { name: "Postman", logo: postmanLogo },
      { name: "Compass", logo: mcLogo },
      { name: "Netlify", logo: netlifyLogo },
      { name: "Figma", logo: figmaLogo },
    ],
  },
];

 export const experiences = [
  {
    title: "Web Development Intern",
    organization: "CodeSoft",
    period: "Feb 2024 - Mar 2024",
    description:
      "Built responsive UI components using React and Tailwind CSS. Collaborated with mentors on real-world projects.",
  },
  {
    title: "Job-Portal Website",
    organization: "Final Year Project",
    period: "Aug 2024 - June 2025",
    description:
      "Created a React.js and Spring boot web app for job-portal with authentication and REST APIs.",
  },
  {
    title: "Frontend Bootcamp",
    organization: "FreeCodeCamp",
    period: "May 2024 - Jul 2024",
    description:
      "Completed hands-on frontend projects and earned certifications in responsive web design and JS.",
  },
];


export const education = [
  {
    id: 0,
    img: AKTU,
    school: "Dr. A. P. J. Abdul Kalam Technical University, Lucknow",
    date: "Sept 2021 - July 2025",
    grade: "7.51 CGPA",
    desc: "I have completed my B.Tech Degree in Computer Applications from Dr. A. P. J. Abdul Kalam Technical University, Lucknow , I gained a strong foundation in programming, software development, and computer science principles. I have studied courses such as Data Structures, Algorithms, Object-Oriented Programming, Database Management Systems, Web Development, and Software Engineering. I actively participated in various workshops and technical events, which enhanced my skills and knowledge.",
    degree: "Master of Computer Applications - MCA",
  },
  {
    id: 1,
    img: CBSE,
    school: "Purvanchal Public School, Kauriram",
    date: "Apr 2020 - March 2021",
    grade: "78%",
    desc: "I completed my class 12 education from Purvanchal Public School, Kauriram Gorakhpur, under the CBSE board, where I studied Physics, Chemistry, and Mathematics (PCM).",
    degree: "CBSE(XII) - PCM",
  },
  {
    id: 2,
    img: CBSE,
    school: "T.R.C Memorial Public School",
    date: "Apr 2018 - March 2019",
    grade: "87.5%",
    desc: "I completed my class 10 education from T.R.C Memorial Public School,Shivrajpur Gorakhpur, under the CBSE board, where I studied Science with Computer.",
    degree: "CBSE(X), Science with Computer Application",
  },
];

export const projects = [
  {
    id: 0,
    title: "Netflix Clone",
    description:
      "Creating a Netflix clone using HTML and CSS focuses on designing the user interface to mimic Netflix's sleek and responsive layout. This involves building a homepage with a navigation bar, search functionality, and movie/TV show thumbnails arranged in a grid or carousel. CSS is used for styling, including hover effects, responsive design for different devices, and consistent color schemes.",
    image: Netflix,
    tags: ["HTML", "CSS", "JavaScript"],
    github: "https://github.com/codingmastr/CSPrep",
    webapp: "https://satyamsharmaportfolio12.netlify.app/netflix/",
  },
  {
    id: 1,
    title: "Calculator",
    description:
      "Developing a calculator clone using HTML, CSS, and JavaScript involves creating a simple yet functional UI with buttons for numbers and operations. The HTML handles the structure, CSS styles the layout for a clean and intuitive interface, and JavaScript manages the logic for performing calculations like addition, subtraction, multiplication, and division, updating the display dynamically as users interact",
    image: Calculator,
    tags: ["HTML", "CSS", "JavaScript"],
    github: "https://github.com/codingmastr/cmtk-email-validator",
    webapp: "https://satyamsharmaportfolio12.netlify.app/calculator/calculator",
  },
  {
    id: 2,
    title: "Movie Recommendation App",
    description:
      "A React-based web application that provides movie recommendations based on different criteria, such as genres, user preferences, and popular trends. The intuitive design and smooth experience make it a go-to app for movie enthusiasts.",
    image: movierecLogo,
    tags: ["React JS", "API", "HTML", "CSS", "JavaScript"],
    github: "https://github.com/codingmastr/Movie-Recommendation-App",
    webapp: "https://movie-recommendation-app-jet.vercel.app/",
  },
  {
    id: 3,
    title: "GitHub Profile Detective",
    description:
      "A powerful and user-friendly React.js application designed to uncover and showcase detailed GitHub profile information. Simply enter a GitHub username, and the app fetches comprehensive data, including profile stats, repositories, followers, and contributions. The intuitive interface ensures a seamless experience, making it a must-visit tool for developers and recruiters.",
    image: githubdetLogo,
    tags: ["HTML", "CSS", "JavaScript", "React JS", "API"],
    github:
      "https://github.com/codingmastr/GitHub-Profile-Search-App-Using-React-JS",
    webapp: "https://githubprofiledetective.netlify.app/",
  },
  {
    id: 4,
    title: "GUI Hotel Booking Form",
    description:
      "Developing a GUI hotel booking form in Java involves creating a user-friendly interface using Swing . The form typically includes fields for entering guest details, selecting room types, check-in/check-out dates, and payment options. Buttons for submitting or resetting the form are essential. The interface should be intuitive, with input validation and clear navigation to enhance the user experience.",
    image: GUIHotel,
    tags: ["Java", "Swing", "JFrame", "Mongoes"],
    github:
      "https://github.com/satyamsharma1503/JAVADSA/blob/main/MongoDB/MongoDBJava/src/GUI_HotelBooking.java",
    webapp: "chrome://extensions/?id=kngheeibjnnidhfoomkpnbeghackheci",
  },
  {
    id: 5,
    title: "GUI Railway Registation Form",
    description:
      "Creating a GUI railway registration form in Java involves using Swing components like JFrame for the main window, JPanel for organizing elements, and JTextField and JComboBox for input fields such as name, age, gender, and travel class. JButton triggers actions like form submission, while JLabel provides descriptive text. Layout managers like GridLayout or FlowLayout arrange components neatly.",
    image: Railway,
    tags: ["Java", "Swing", "JFrame", "MySql"],
    github:
      "https://github.com/satyamsharma1503/JAVADSA/blob/main/MongoDB/MongoDBJava/src/railway.java",
    webapp: "https://webversedigital.com/",
  },
  {
    id: 6,
    title: "JobPortal Website",
    description:
      "A job portal website built with React offers user-friendly navigation, advanced job search filters, and secure account management. It enables users to post resumes, apply for jobs, and connect with recruiters, streamlining the recruitment process efficiently and effectively.",
    image: JobPortal,
    tags: ["React JS", "MongoDB", "SpringBoot"],
    github:
      "https://github.com/satyamsharma1503/Job-Portal-website-Frontend/tree/master",
    webapp: "https://codingmasterweb.in/",
  },
  {
    id: 7,
    title: "Image Search App",
    description:
      "A React.js-based image search application that allows users to search and download high-quality images from the web. Built using external APIs to ensure a vast library of results for various queries.",
    image: imagesearchLogo,
    tags: ["React JS", "API", "Search Feature", "CSS", "Javascript"],
    github: "https://github.com/codingmastr/Image-Search-App",
    webapp: "https://imagsearch.netlify.app/",
  },
];
