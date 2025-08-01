import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";
import "./App.css";

function App() {
  const [selectedComponent, setSelectedComponent] = useState("book");

  const renderComponentIfElse = () => {
    if (selectedComponent === "book") {
      return <BookDetails />;
    } else if (selectedComponent === "blog") {
      return <BlogDetails />;
    } else if (selectedComponent === "course") {
      return <CourseDetails />;
    } else if (selectedComponent === "all") {
      return (
        <div className="card-row">
          <BookDetails />
          <BlogDetails />
          <CourseDetails />
        </div>
      );
    } else {
      return <p className="placeholder">Please select a component</p>;
    }
  };

  const renderComponentSwitch = () => {
    switch (selectedComponent) {
      case "book":
        return <BookDetails />;
      case "blog":
        return <BlogDetails />;
      case "course":
        return <CourseDetails />;
      case "all":
        return (
          <div className="card-row">
            <BookDetails />
            <BlogDetails />
            <CourseDetails />
          </div>
        );
      default:
        return <p className="placeholder">No component selected</p>;
    }
  };

  return (
    <div className="App">
      <h1>📚 Blogger App</h1>

      <div className="button-group">
        {["book", "blog", "course", "all", "none"].map((key) => (
          <button key={key} onClick={() => setSelectedComponent(key)}>
            {key === "all"
              ? "Show All"
              : key.charAt(0).toUpperCase() + key.slice(1)}
          </button>
        ))}
      </div>

      <section>
        <h2>🔁 Method 1: if-else block</h2>
        <div className={selectedComponent === "all" ? "" : "card-row"}>
          {renderComponentIfElse()}
        </div>
      </section>

      <section>
        <h2>🔁 Method 2: Ternary rendering</h2>
        <div className="card-row">
          {selectedComponent === "book" ? (
            <BookDetails />
          ) : selectedComponent === "blog" ? (
            <BlogDetails />
          ) : selectedComponent === "course" ? (
            <CourseDetails />
          ) : selectedComponent === "all" ? (
            <>
              <BookDetails />
              <BlogDetails />
              <CourseDetails />
            </>
          ) : (
            <p className="placeholder">No content selected</p>
          )}
        </div>
      </section>

      <section>
        <h2>🔁 Method 3: && operator</h2>
        <div className="card-row">
          {selectedComponent === "book" && <BookDetails />}
          {selectedComponent === "blog" && <BlogDetails />}
          {selectedComponent === "course" && <CourseDetails />}
          {selectedComponent === "all" && (
            <>
              <BookDetails />
              <BlogDetails />
              <CourseDetails />
            </>
          )}
        </div>
      </section>

      <section>
        <h2>🔁 Method 4: Function-based (switch)</h2>
        <div className={selectedComponent === "all" ? "" : "card-row"}>
          {renderComponentSwitch()}
        </div>
      </section>
    </div>
  );
}

export default App;
