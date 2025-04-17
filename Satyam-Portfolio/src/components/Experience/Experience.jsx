import React from "react";
import { experiences } from "../../constants";

export default function UniqueExperienceTimeline() {
  return (
    <section
      id="experience"
      className="py-24 pb-24 px-[12vw] md:px-[7vw] lg:px-[16vw] font-sans bg-skills-gradient clip-path-custom-2"
    >
      <div className="text-center mb-16">
        <h2 className="text-4xl font-bold text-white">EXPERIENCE</h2>
        <div className="w-32 h-1 bg-purple-500 mx-auto mt-4"></div>

        <p className="text-gray-400 mt-4 text-lg font-semibold">
          A collection of my work experience and the roles I have taken in
          various organizations
        </p>
      </div>
      <div className="relative max-w-5xl mx-auto before:absolute before:left-1/2 before:top-0 before:bottom-0 before:w-1 before:bg-purple-800 before:transform before:-translate-x-1/2">
        {experiences.map((exp, index) => {
          const isLeft = index % 2 === 0;
          return (
            <div
              key={index}
              className={`mb-12 flex justify-between items-center w-full ${
                isLeft ? "flex-row" : "flex-row-reverse"
              }`}
            >
              <div className="w-5/12"></div>
              <div className="z-10 flex items-center justify-center bg-purple-500 text-white w-10 h-10 rounded-full shadow-md animate-pulse">
                {index + 1}
              </div>
              <div className="bg-gray-900 backdrop-blur-md w-5/12 p-10 rounded-2xl shadow-md border  border-white transition duration-300 hover:shadow-blue-600  hover:scale-105">
                <h3 className="text-xl font-bold text-white">{exp.title}</h3>
                <p className="text-blue-400 font-medium">{exp.organization}</p>
                <p className="text-sm text-gray-200 italic">{exp.period}</p>
                <p className="mt-2 text-white">{exp.description}</p>
              </div>
            </div>
          );
        })}
      </div>
    </section>
  );
}

